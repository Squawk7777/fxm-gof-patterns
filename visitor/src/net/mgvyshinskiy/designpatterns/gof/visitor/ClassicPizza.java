package net.mgvyshinskiy.designpatterns.gof.visitor;

import net.mgvyshinskiy.designpatterns.gof.visitor.visitors.StuffVisitor;

public class ClassicPizza extends AbstractPizza {
    @Override
    void accept(StuffVisitor visitor) {
        visitor.visit(this);
    }
}
