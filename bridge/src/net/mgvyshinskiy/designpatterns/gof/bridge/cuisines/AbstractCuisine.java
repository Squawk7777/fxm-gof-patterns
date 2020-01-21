package net.mgvyshinskiy.designpatterns.gof.bridge.cuisines;

import net.mgvyshinskiy.designpatterns.gof.bridge.producers.AbstractMealProducer;
import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;

public abstract class AbstractCuisine {
    private AbstractMealProducer mealProducer;

    public AbstractCuisine(AbstractMealProducer mealProducer) {
        this.mealProducer = mealProducer;
    }

    protected abstract void checkCuisine(Class<? extends Meal> mealClass);

    public <T extends Meal> T orderMeal(Class<T> mealClass) throws ReflectiveOperationException {
        T meal = null;
        try {
            checkCuisine(mealClass);
            meal = mealProducer.cook(mealClass);
        } catch (IllegalArgumentException e) {
            System.out.println(mealClass.getSimpleName() + ": " + e.getMessage());
        }
        return meal;
    }
}
