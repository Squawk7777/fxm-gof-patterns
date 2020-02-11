package net.mgvyshinskiy.designpatterns.gof.abstractfactory;

import net.mgvyshinskiy.designpatterns.gof.abstractfactory.cuisines.*;

import java.lang.reflect.InvocationTargetException;

public class AbstractFactory {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Cuisine ukrainianCuisine = CuisineFactory.createCuisine(UkrainianCuisine.class);
        Cuisine americanCuisine = CuisineFactory.createCuisine(AmericanCuisine.class);
        Cuisine japaneseCuisine = CuisineFactory.createCuisine(JapaneseCuisine.class);

        LuchSet ukrainianLunchSet = ukrainianCuisine.createLunchSet();
        LuchSet americanLunchSet = americanCuisine.createLunchSet();
        LuchSet japaneseLunchSet = japaneseCuisine.createLunchSet();

        System.out.println(ukrainianLunchSet);
        System.out.println(americanLunchSet);
        System.out.println(japaneseLunchSet);
    }
}
