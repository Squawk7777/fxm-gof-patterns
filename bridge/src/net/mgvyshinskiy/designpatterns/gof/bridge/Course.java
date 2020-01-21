package net.mgvyshinskiy.designpatterns.gof.bridge;

public interface Course {
    <T extends Meal> T cook(Class<T> mealClass) throws ReflectiveOperationException;
}
