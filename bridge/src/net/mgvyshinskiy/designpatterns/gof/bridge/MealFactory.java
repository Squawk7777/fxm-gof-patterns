package net.mgvyshinskiy.designpatterns.gof.bridge;

abstract class MealFactory {
    abstract void checkCourse(Class<? extends Meal> mealClass);

    public <T extends Meal> T cook(Class<T> mealClass) throws ReflectiveOperationException {
        T meal = null;
        try {
            checkCourse(mealClass);
            return mealClass.getDeclaredConstructor().newInstance();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return meal;
    }
}
