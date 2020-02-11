package net.mgvyshinskiy.designpatterns.gof.bridge.cuisines;

import net.mgvyshinskiy.designpatterns.gof.bridge.producers.AbstractMealProducer;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.Japanese;
import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;

public class JapaneseCuisine extends AbstractCuisine {
    public JapaneseCuisine(AbstractMealProducer mealProducer) {
        super(mealProducer);
    }

    @Override
    protected void checkCuisine(Class<? extends Meal> mealClass) {
        if (!Japanese.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong cuisine");
        }
    }
}
