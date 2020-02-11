package net.mgvyshinskiy.designpatterns.gof.decorator.decorators;

import net.mgvyshinskiy.designpatterns.gof.decorator.AbstractPizza;

public abstract class AbstractPizzaDecorator extends AbstractPizza {
    protected AbstractPizza pizza;

    public AbstractPizzaDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }
}
