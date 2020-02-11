package net.mgvyshinskiy.designpatterns.gof.decorator.decorators;

import net.mgvyshinskiy.designpatterns.gof.decorator.AbstractPizza;

public class BaconPizzaDecorator extends AbstractPizzaDecorator {
    public BaconPizzaDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return "Bacon + " + pizza.bake();
    }
}
