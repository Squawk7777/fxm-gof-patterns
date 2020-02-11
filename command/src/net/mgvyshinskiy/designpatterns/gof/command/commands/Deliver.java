package net.mgvyshinskiy.designpatterns.gof.command.commands;

import net.mgvyshinskiy.designpatterns.gof.command.Pizza;

public class Deliver implements Command {
    private Pizza pizza;
    private String address;

    public Deliver(Pizza pizza, String address) {
        this.pizza = pizza;
        this.address = address;
    }

    @Override
    public void execute() {
        System.out.println("#" + pizza.hashCode() + " Pizza delivered to " + address);
    }

    @Override
    public void undo() {
        System.out.println("#" + pizza.hashCode() + " Pizza reverted from " + address);
    }
}
