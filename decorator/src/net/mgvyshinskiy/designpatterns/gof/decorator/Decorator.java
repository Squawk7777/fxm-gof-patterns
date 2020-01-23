package net.mgvyshinskiy.designpatterns.gof.decorator;

import net.mgvyshinskiy.designpatterns.gof.decorator.decorators.*;

public class Decorator {
    public static void main(String[] args) {
        AbstractPizza cheesySeafood = new SeafoodPizzaDecorator(new CheesePizzaDecorator(new Pizza("Cheesy Seafood")));
        AbstractPizza baconPineapple = new PineapplePizzaDecorator(new BaconPizzaDecorator(new Pizza("Bacon Pineapple")));
        AbstractPizza doubleCheeseBacon = new CheesePizzaDecorator(new CheesePizzaDecorator(new BaconPizzaDecorator(new Pizza("Double Cheese Bacon"))));

        System.out.println(cheesySeafood.bake());
        System.out.println(baconPineapple.bake());
        System.out.println(doubleCheeseBacon.bake());
    }
}
