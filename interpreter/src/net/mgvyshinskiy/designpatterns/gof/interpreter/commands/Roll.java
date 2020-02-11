package net.mgvyshinskiy.designpatterns.gof.interpreter.commands;

import net.mgvyshinskiy.designpatterns.gof.interpreter.Pizza;

public class Roll implements Command {
    @Override
    public void execute(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza dough rolled out");
    }

    @Override
    public void undo(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza dough rolled back");
    }
}
