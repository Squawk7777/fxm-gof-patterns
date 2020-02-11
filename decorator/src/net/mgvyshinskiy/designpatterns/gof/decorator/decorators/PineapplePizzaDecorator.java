package net.mgvyshinskiy.designpatterns.gof.decorator.decorators;

import net.mgvyshinskiy.designpatterns.gof.decorator.AbstractPizza;

public class PineapplePizzaDecorator extends AbstractPizzaDecorator {
    public PineapplePizzaDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return "Pineapple + " + pizza.bake();
    }
}
