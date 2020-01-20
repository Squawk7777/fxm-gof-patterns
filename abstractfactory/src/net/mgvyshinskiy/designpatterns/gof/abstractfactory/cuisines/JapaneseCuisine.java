package net.mgvyshinskiy.designpatterns.gof.abstractfactory.cuisines;

import net.mgvyshinskiy.designpatterns.gof.abstractfactory.LuchSet;
import net.mgvyshinskiy.designpatterns.gof.abstractfactory.meals.*;

public class JapaneseCuisine implements Cuisine {
    @Override
    public LuchSet createLunchSet() {
        LuchSet luchSet = new LuchSet();
        luchSet.addMeal(new Sashimi(), 1);
        luchSet.addMeal(new Sushi(), 3);
        luchSet.addMeal(new Ramen(), 1);

        return luchSet;
    }
}
