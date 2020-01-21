package net.mgvyshinskiy.designpatterns.gof.bridge;

public class FirstCourseFactory extends MealFactory implements Course{
    @Override
    void checkCourse(Class<? extends Meal> mealClass) {
        if (!FirstCourse.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong course");
        }
    }
}
