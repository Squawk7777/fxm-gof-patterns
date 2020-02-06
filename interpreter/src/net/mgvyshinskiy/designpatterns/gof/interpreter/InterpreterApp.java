package net.mgvyshinskiy.designpatterns.gof.interpreter;

import net.mgvyshinskiy.designpatterns.gof.interpreter.commands.*;

public class InterpreterApp {
    public static void main(String[] args) {
        String pizzaRecipe = "CHEESE-SEAFOOD-PINEAPPLE";

        Pizza pizza = new Pizza();
        PizzaBoy pizzaBoy = new PizzaBoy();

        pizzaBoy.execute(pizza, new Roll());
        pizzaBoy.execute(pizza, RecipeInterpreter.interpret(pizzaRecipe).toArray(new Command[0]));
        pizzaBoy.execute(pizza, new Bake());
        pizzaBoy.execute(pizza, new Pack());
        pizzaBoy.execute(pizza, new Deliver("45000 Fremont Blvd, Fremont, CA 94538"));
    }
}
