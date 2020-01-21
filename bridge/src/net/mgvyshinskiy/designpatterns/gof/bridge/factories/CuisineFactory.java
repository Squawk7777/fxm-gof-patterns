package net.mgvyshinskiy.designpatterns.gof.bridge.factories;

import net.mgvyshinskiy.designpatterns.gof.bridge.cuisines.AbstractCuisine;
import net.mgvyshinskiy.designpatterns.gof.bridge.producers.AbstractMealProducer;

public class CuisineFactory {
    private CuisineFactory() {
    }

    public static <T extends AbstractCuisine> T createCuisine(Class<T> cuisineClass, AbstractMealProducer mealProducer) throws ReflectiveOperationException {
        return cuisineClass.getDeclaredConstructor(AbstractMealProducer.class).newInstance(mealProducer);
    }
}
