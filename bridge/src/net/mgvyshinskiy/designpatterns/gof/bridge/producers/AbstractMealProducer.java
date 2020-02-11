package net.mgvyshinskiy.designpatterns.gof.bridge.producers;

import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;

public abstract class AbstractMealProducer {
    abstract void checkCourse(Class<? extends Meal> mealClass);

    public <T extends Meal> T cook(Class<T> mealClass) throws ReflectiveOperationException {
        checkCourse(mealClass);
        return mealClass.getDeclaredConstructor().newInstance();
    }
}
