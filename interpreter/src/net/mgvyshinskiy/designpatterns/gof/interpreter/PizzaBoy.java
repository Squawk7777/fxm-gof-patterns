package net.mgvyshinskiy.designpatterns.gof.interpreter;

import net.mgvyshinskiy.designpatterns.gof.interpreter.commands.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.stream.Stream;

public class PizzaBoy {
    private Map<Pizza, Stack<Command>> redoList = new HashMap<>();
    private Map<Pizza, Stack<Command>> undoList = new HashMap<>();

    public void execute(Pizza pizza, Command... cmds) {
        Stream.of(cmds).forEach(cmd -> {
            cmd.execute(pizza);
            undoList.compute(pizza, (k, v) -> {
                if (Objects.isNull(v)) {
                    Stack<Command> commands = new Stack<>();
                    commands.push(cmd);
                    return commands;
                } else {
                    v.push(cmd);
                    return v;
                }
            });
        });
    }

    public void redo(Pizza pizza) {
        Command cmd = redoList.get(pizza).pop();
        execute(pizza, cmd);
    }

    public void undo(Pizza pizza) {
        Command cmd = undoList.get(pizza).pop();
        cmd.undo(pizza);

        redoList.compute(pizza, (k, v) -> {
            if (Objects.isNull(v)) {
                Stack<Command> commands = new Stack<>();
                commands.push(cmd);
                return commands;
            } else {
                v.push(cmd);
                return v;
            }
        });
    }
}
