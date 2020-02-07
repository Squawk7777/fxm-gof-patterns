package net.mgvyshinskiy.designpatterns.gof.visitor;

import net.mgvyshinskiy.designpatterns.gof.visitor.visitors.*;

public class VisitorApp {
    public static void main(String[] args) {
        ClassicPizza classicPizza = new ClassicPizza();
        classicPizza.accept(new CheeseStuffVisitor());
        classicPizza.accept(new BaconStuffVisitor());
        classicPizza.accept(new MushroomsStuffVisitor());

        RomanPizza romanPizza = new RomanPizza();
        romanPizza.accept(new CheeseStuffVisitor());
        romanPizza.accept(new SeafoodStuffVisitor());
        romanPizza.accept(new PineappleStuffVisitor());

        System.out.println("Classic pizza: " + classicPizza.getRecipe());
        System.out.println("Roman pizza: " + romanPizza.getRecipe());
    }
}
