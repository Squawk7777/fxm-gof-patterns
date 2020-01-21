package net.mgvyshinskiy.designpatterns.gof.bridge;

public interface Cuisine {
    <T extends Meal> T orderMeal(Class<T> mealClass);
}
