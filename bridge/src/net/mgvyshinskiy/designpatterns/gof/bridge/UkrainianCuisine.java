package net.mgvyshinskiy.designpatterns.gof.bridge;

public class UkrainianCuisine<T1 extends CourseMarker> extends AbstractCuisine<T1> {
    public UkrainianCuisine(Course course) {
        super(course);
    }

    @Override
    void checkCuisine(Class<? extends Meal> mealClass) throws IllegalArgumentException {
        if (!Ukrainian.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong cousine");
        }
    }
}
