package net.mgvyshinskiy.designpatterns.gof.bridge.cuisines;

import net.mgvyshinskiy.designpatterns.gof.bridge.producers.AbstractMealProducer;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.Ukrainian;
import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;

public class UkrainianCuisine extends AbstractCuisine {
    public UkrainianCuisine(AbstractMealProducer mealProducer) {
        super(mealProducer);
    }

    @Override
    protected void checkCuisine(Class<? extends Meal> mealClass) {
        if (!Ukrainian.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong cuisine");
        }
    }
}
