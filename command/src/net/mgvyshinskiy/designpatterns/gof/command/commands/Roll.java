package net.mgvyshinskiy.designpatterns.gof.command.commands;

import net.mgvyshinskiy.designpatterns.gof.command.Pizza;

public class Roll implements Command {
    private Pizza pizza;

    public Roll(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        System.out.println("#" + pizza.hashCode() + " Pizza dough rolled out");
    }

    @Override
    public void undo() {
        System.out.println("#" + pizza.hashCode() + " Pizza dough rolled back");
    }
}
