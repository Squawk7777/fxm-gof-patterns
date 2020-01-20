package net.mgvyshinskiy.designpatterns.gof.abstractfactory;

import net.mgvyshinskiy.designpatterns.gof.abstractfactory.cuisines.Cuisine;

import java.lang.reflect.InvocationTargetException;

public class CuisineFactory {
    public static Cuisine createCuisine(Class<? extends Cuisine> cuisineClass) throws NoSuchMethodException, IllegalAccessException,
                                                                                      InvocationTargetException, InstantiationException {
        return cuisineClass.getDeclaredConstructor().newInstance();
    }
}
