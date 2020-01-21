package net.mgvyshinskiy.designpatterns.gof.bridge.producers;

import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.FirstCourse;

public class FirstCourseMealProducer extends AbstractMealProducer {
    @Override
    void checkCourse(Class<? extends Meal> mealClass) {
        if (!FirstCourse.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong course");
        }
    }
}
