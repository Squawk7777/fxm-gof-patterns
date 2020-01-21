package net.mgvyshinskiy.designpatterns.gof.bridge;

abstract class AbstractCuisine {
    protected Course course;

    public AbstractCuisine(Course course) {
        this.course = course;
    }

    abstract void checkCuisine(Class<? extends Meal> mealClass);

    public <T extends Meal> T cook(Class<T> mealClass) throws ReflectiveOperationException {
        T meal = null;
        try {
            checkCuisine(mealClass);
            meal = mealClass.getDeclaredConstructor().newInstance();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return meal;
    }
}
