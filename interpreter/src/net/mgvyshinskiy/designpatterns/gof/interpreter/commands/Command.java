package net.mgvyshinskiy.designpatterns.gof.interpreter.commands;

import net.mgvyshinskiy.designpatterns.gof.interpreter.Pizza;

public interface Command {
    void execute(Pizza pizza);

    void undo(Pizza pizza);
}
