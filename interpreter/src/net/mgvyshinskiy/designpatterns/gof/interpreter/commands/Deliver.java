package net.mgvyshinskiy.designpatterns.gof.interpreter.commands;

import net.mgvyshinskiy.designpatterns.gof.interpreter.Pizza;

public class Deliver implements Command {
    private String address;

    public Deliver(String address) {
        this.address = address;
    }

    @Override
    public void execute(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza delivered to " + address);
    }

    @Override
    public void undo(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza reverted from " + address);
    }
}
