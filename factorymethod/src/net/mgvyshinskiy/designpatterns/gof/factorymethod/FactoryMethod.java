package net.mgvyshinskiy.designpatterns.gof.factorymethod;

import java.lang.reflect.InvocationTargetException;

public class FactoryMethod {
    public static void main(String[] args) throws
                                           InvocationTargetException,
                                           NoSuchMethodException,
                                           InstantiationException,
                                           IllegalAccessException,
                                           ClassNotFoundException {
        for (String mealClassName : args) {
            Class<?> mealClass = Class.forName(Meal.class.getPackageName() + "." + mealClassName);
            Meal meal = (Meal) Oven.cookMeal(mealClass);

            System.out.println(meal);
        }
    }
}
