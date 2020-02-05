package net.mgvyshinskiy.designpatterns.gof.command.commands;

import net.mgvyshinskiy.designpatterns.gof.command.Pizza;
import net.mgvyshinskiy.designpatterns.gof.command.Stuffing;

public class Stuff implements Command {
    private Pizza pizza;
    private Stuffing stuffing;

    public Stuff(Pizza pizza, Stuffing stuffing) {
        this.pizza = pizza;
        this.stuffing = stuffing;
    }

    @Override
    public void execute() {
        System.out.println("#" + pizza.hashCode() + " Pizza stuffed with " + stuffing);
        this.pizza.addStuffing(stuffing);
    }

    @Override
    public void undo() {
        System.out.println("#" + pizza.hashCode() + " Pizza cleared of " + stuffing);
        this.pizza.removeStuffing(stuffing);
    }
}
