package net.mgvyshinskiy.designpatterns.gof.abstractfactory;

import net.mgvyshinskiy.designpatterns.gof.abstractfactory.meals.Meal;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LuchSet {
    private Map<Meal, Integer> meals;

    public LuchSet() {
        meals = new HashMap<>();
    }

    public void addMeal(Meal meal, Integer quantity) {
        meals.merge(meal, quantity, Integer::sum);
    }

    public void removeMeal(Meal meal, Integer quantity) {
        meals.computeIfPresent(meal, (key, oldQnt) -> oldQnt > quantity ? oldQnt - quantity : null);
    }

    @Override
    public String toString() {
        return meals.entrySet().stream()
                    .map(entry -> entry.getKey().getClass().getSimpleName() + ": " + entry.getValue())
                    .collect(Collectors.joining("\n"));
    }
}
