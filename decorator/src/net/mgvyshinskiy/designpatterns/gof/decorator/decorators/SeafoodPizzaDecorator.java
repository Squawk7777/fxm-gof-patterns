package net.mgvyshinskiy.designpatterns.gof.decorator.decorators;

import net.mgvyshinskiy.designpatterns.gof.decorator.AbstractPizza;

public class SeafoodPizzaDecorator extends AbstractPizzaDecorator {
    public SeafoodPizzaDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return "Seafood + " + pizza.bake();
    }
}
