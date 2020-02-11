package net.mgvyshinskiy.designpatterns.gof.command;

import net.mgvyshinskiy.designpatterns.gof.command.commands.*;

public class Command {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        PizzaBoy pizzaBoy = new PizzaBoy(); // aka Invoker

        pizzaBoy.execute(new Roll(pizza));
        pizzaBoy.execute(new Stuff(pizza, Stuffing.CHEESE));
        pizzaBoy.execute(new Stuff(pizza, Stuffing.BACON));
        pizzaBoy.execute(new Stuff(pizza, Stuffing.MUSHROOMS));
        pizzaBoy.undo(); // no mushrooms please
        pizzaBoy.execute(new Bake(pizza));
        pizzaBoy.execute(new Pack(pizza));
        pizzaBoy.undo(); // the box was wrinkled
        pizzaBoy.redo(); // repack pizza
        pizzaBoy.execute(new Deliver(pizza, "45000 Fremont Blvd, Fremont, CA 94538"));
    }
}
