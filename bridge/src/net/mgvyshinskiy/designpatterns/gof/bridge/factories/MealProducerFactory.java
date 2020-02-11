package net.mgvyshinskiy.designpatterns.gof.bridge.factories;

import net.mgvyshinskiy.designpatterns.gof.bridge.producers.AbstractMealProducer;

public class MealProducerFactory {
    private MealProducerFactory() {
    }

    public static <T extends AbstractMealProducer> T createMealProducer(Class<T> mealProducerClass) throws ReflectiveOperationException {
        return mealProducerClass.getDeclaredConstructor().newInstance();
    }
}
