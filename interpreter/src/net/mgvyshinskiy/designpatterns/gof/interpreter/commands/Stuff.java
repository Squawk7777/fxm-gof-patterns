package net.mgvyshinskiy.designpatterns.gof.interpreter.commands;

import net.mgvyshinskiy.designpatterns.gof.interpreter.Pizza;
import net.mgvyshinskiy.designpatterns.gof.interpreter.Stuffing;

public class Stuff implements Command {
    private Stuffing stuffing;

    public Stuff(Stuffing stuffing) {
        this.stuffing = stuffing;
    }

    @Override
    public void execute(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza stuffed with " + stuffing);
        pizza.addStuffing(stuffing);
    }

    @Override
    public void undo(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza cleared of " + stuffing);
        pizza.removeStuffing(stuffing);
    }
}
