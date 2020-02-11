package net.mgvyshinskiy.designpatterns.gof.visitor.visitors;

import net.mgvyshinskiy.designpatterns.gof.visitor.ClassicPizza;
import net.mgvyshinskiy.designpatterns.gof.visitor.RomanPizza;
import net.mgvyshinskiy.designpatterns.gof.visitor.Stuffing;

public class PineappleStuffVisitor implements StuffVisitor {
    @Override
    public void visit(ClassicPizza pizza) {
        pizza.addStuffing(Stuffing.PINEAPPLE);
    }

    @Override
    public void visit(RomanPizza pizza) {
        pizza.addStuffing(Stuffing.PINEAPPLE);
    }
}
