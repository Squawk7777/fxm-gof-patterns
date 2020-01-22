package net.mgvyshinskiy.designpatterns.gof.bridge.cuisines;

import net.mgvyshinskiy.designpatterns.gof.bridge.producers.AbstractMealProducer;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.American;
import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;

public class AmericanCuisine extends AbstractCuisine {
    public AmericanCuisine(AbstractMealProducer mealProducer) {
        super(mealProducer);
    }

    @Override
    protected void checkCuisine(Class<? extends Meal> mealClass) {
        if (!American.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong cuisine");
        }
    }
}
