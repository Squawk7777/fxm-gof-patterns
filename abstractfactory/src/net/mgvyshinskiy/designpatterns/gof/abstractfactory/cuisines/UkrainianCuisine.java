package net.mgvyshinskiy.designpatterns.gof.abstractfactory.cuisines;

import net.mgvyshinskiy.designpatterns.gof.abstractfactory.LuchSet;
import net.mgvyshinskiy.designpatterns.gof.abstractfactory.meals.*;

public class UkrainianCuisine implements Cuisine {
    @Override
    public LuchSet createLunchSet() {
        LuchSet luchSet = new LuchSet();
        luchSet.addMeal(new Borsch(), 1);
        luchSet.addMeal(new Pampushki(), 5);
        luchSet.addMeal(new Vareniki(), 5);

        return luchSet;
    }
}
