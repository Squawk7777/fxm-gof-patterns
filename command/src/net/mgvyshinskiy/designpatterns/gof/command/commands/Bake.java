package net.mgvyshinskiy.designpatterns.gof.command.commands;

import net.mgvyshinskiy.designpatterns.gof.command.Pizza;
import net.mgvyshinskiy.designpatterns.gof.command.Stuffing;

import java.util.stream.Collectors;

public class Bake implements Command {
    private Pizza pizza;

    public Bake(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void execute() {
        System.out.println("#" + pizza.hashCode() + " Pizza baked with " + pizza.getStuffing().stream()
                .map(Stuffing::toString)
                .collect(Collectors.joining(", ")));
    }

    @Override
    public void undo() {
        System.out.println("Unbake pizza? Seriously?!");
    }
}
