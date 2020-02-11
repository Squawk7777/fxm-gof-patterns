package net.mgvyshinskiy.designpatterns.gof.abstractfactory.cuisines;

import net.mgvyshinskiy.designpatterns.gof.abstractfactory.LuchSet;
import net.mgvyshinskiy.designpatterns.gof.abstractfactory.meals.*;

public class AmericanCuisine implements Cuisine {
    @Override
    public LuchSet createLunchSet() {
        LuchSet luchSet = new LuchSet();
        luchSet.addMeal(new Burger(), 2);
        luchSet.addMeal(new Coleslaw(), 1);
        luchSet.addMeal(new Brownie(), 1);

        return luchSet;
    }
}
