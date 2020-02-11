package net.mgvyshinskiy.designpatterns.gof.decorator.decorators;

import net.mgvyshinskiy.designpatterns.gof.decorator.AbstractPizza;

public class CheesePizzaDecorator extends AbstractPizzaDecorator {
    public CheesePizzaDecorator(AbstractPizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return "Cheese + " + pizza.bake();
    }
}
