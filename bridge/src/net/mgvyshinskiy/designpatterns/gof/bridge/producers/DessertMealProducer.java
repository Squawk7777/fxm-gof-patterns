package net.mgvyshinskiy.designpatterns.gof.bridge.producers;

import net.mgvyshinskiy.designpatterns.gof.bridge.meals.Meal;
import net.mgvyshinskiy.designpatterns.gof.bridge.markers.DessertCourse;

public class DessertMealProducer extends AbstractMealProducer {
    @Override
    void checkCourse(Class<? extends Meal> mealClass) {
        if (!DessertCourse.class.isAssignableFrom(mealClass)) {
            throw new IllegalArgumentException("Wrong course");
        }
    }
}
