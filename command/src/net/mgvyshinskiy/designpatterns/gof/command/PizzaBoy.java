package net.mgvyshinskiy.designpatterns.gof.command;

import net.mgvyshinskiy.designpatterns.gof.command.commands.Command;

import java.util.Stack;

public class PizzaBoy {
    private Stack<Command> redoList = new Stack<>();
    private Stack<Command> undoList = new Stack<>();

    public void execute(Command cmd) {
        cmd.execute();
        undoList.push(cmd);
    }

    public void redo() {
        Command cmd = redoList.pop();
        cmd.execute();
        undoList.push(cmd);
    }

    public void undo() {
        Command cmd = undoList.pop();
        cmd.undo();
        redoList.push(cmd);
    }
}
