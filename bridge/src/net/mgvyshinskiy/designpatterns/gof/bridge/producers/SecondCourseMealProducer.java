package net.mgvyshinskiy.designpatterns.gof.bridge.producers;

import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.SecondCourse;

public class SecondCourseMealProducer extends AbstractMealProducer {
    @Override
    void checkCourse(Class<? extends Meal> mealClass) {
        if (!SecondCourse.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong course");
        }
    }
}
