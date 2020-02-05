package net.mgvyshinskiy.designpatterns.gof.command.commands;

import net.mgvyshinskiy.designpatterns.gof.command.Pizza;

public class Pack implements Command {
    private Pizza pizza;
    private String box;

    public Pack(Pizza pizza) {
        this.pizza = pizza;
        this.box = "Cardboard Box";
    }

    @Override
    public void execute() {
        System.out.println("#" + pizza.hashCode() + " Pizza packed in a " + box);
    }

    @Override
    public void undo() {
        System.out.println("#" + pizza.hashCode() + " Pizza unpacked from " + box);
    }
}
