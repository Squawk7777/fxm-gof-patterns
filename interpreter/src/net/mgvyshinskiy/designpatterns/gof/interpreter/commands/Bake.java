package net.mgvyshinskiy.designpatterns.gof.interpreter.commands;

import net.mgvyshinskiy.designpatterns.gof.interpreter.Pizza;

public class Bake implements Command {
    @Override
    public void execute(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza baked with with crisp");
    }

    @Override
    public void undo(Pizza pizza) {
        System.out.println("Unbake pizza? Seriously?!");
    }
}
