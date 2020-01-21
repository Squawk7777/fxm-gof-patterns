package net.mgvyshinskiy.designpatterns.gof.bridge.producers;

import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.StarterCourse;

public class StarterCourseMealProducer extends AbstractMealProducer {
    @Override
    void checkCourse(Class<? extends Meal> mealClass) {
        if (!StarterCourse.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong course");
        }
    }
}
