package net.mgvyshinskiy.designpatterns.gof.interpreter.commands;

import net.mgvyshinskiy.designpatterns.gof.interpreter.Pizza;

public class Pack implements Command {
    private String box;

    public Pack() {
        this.box = "Cardboard Box";
    }

    @Override
    public void execute(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza packed in a " + box);
    }

    @Override
    public void undo(Pizza pizza) {
        System.out.println("#" + pizza.hashCode() + " Pizza unpacked from " + box);
    }
}
