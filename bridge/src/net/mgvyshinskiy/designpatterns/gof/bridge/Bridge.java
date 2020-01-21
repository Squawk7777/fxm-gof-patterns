package net.mgvyshinskiy.designpatterns.gof.bridge;

import net.mgvyshinskiy.designpatterns.gof.bridge.cuisines.*;
import net.mgvyshinskiy.designpatterns.gof.bridge.factories.*;
import net.mgvyshinskiy.designpatterns.gof.bridge.meals.*;
import net.mgvyshinskiy.designpatterns.gof.bridge.producers.*;

import java.util.Objects;

public class Bridge {
    public static void main(String[] args) throws ReflectiveOperationException {
        AbstractMealProducer starterProducer = MealProducerFactory.createMealProducer(StarterCourseMealProducer.class);
        AbstractMealProducer firstCourseProducer = MealProducerFactory.createMealProducer(FirstCourseMealProducer.class);
        AbstractMealProducer dessertProducer = MealProducerFactory.createMealProducer(DessertMealProducer.class);

        AbstractCuisine ukrainianCuisine = CuisineFactory.createCuisine(UkrainianCuisine.class, dessertProducer);
        AbstractCuisine japaneseCuisine = CuisineFactory.createCuisine(JapaneseCuisine.class, firstCourseProducer);
        AbstractCuisine americanCuisine = CuisineFactory.createCuisine(AmericanCuisine.class, starterProducer);

        ukrainianCuisine.orderMeal(Borsch.class);
        americanCuisine.orderMeal(Sashimi.class);
        japaneseCuisine.orderMeal(Mochi.class);

        Objects.requireNonNull(ukrainianCuisine.orderMeal(Smetannik.class));
        Objects.requireNonNull(americanCuisine.orderMeal(Coleslaw.class));
        Objects.requireNonNull(japaneseCuisine.orderMeal(Ramen.class));
    }
}
