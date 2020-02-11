package net.mgvyshinskiy.designpatterns.gof.builder;

public class Builder {
    public static void main(String[] args) {
        Pizza pizzaTropical = new Pizza.Builder("Tropical").withCheese().withSeafood().withPineapple().build();
        Pizza pizzaCheeseNBacon = new Pizza.Builder("Cheese & Bacon").withCheese().withBacon().build();

        System.out.println(pizzaTropical);
        System.out.println(pizzaCheeseNBacon);
    }
}
