package net.mgvyshinskiy.designpatterns.gof.decorator;

public class Pizza extends AbstractPizza {
    public Pizza(String pizzaTitle) {
        this.pizzaTitle = pizzaTitle;
    }

    @Override
    public String bake() {
        return "Base (" + pizzaTitle + ")";
    }
}
