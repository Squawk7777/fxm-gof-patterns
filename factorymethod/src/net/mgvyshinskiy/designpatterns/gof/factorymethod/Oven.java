package net.mgvyshinskiy.designpatterns.gof.factorymethod;

import java.lang.reflect.InvocationTargetException;

public class Oven {
    public static Object cookMeal(Class<?> mealClass) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (!Meal.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Class must implement Meal interface");
        }
        return mealClass.getDeclaredConstructor().newInstance();
    }
}
