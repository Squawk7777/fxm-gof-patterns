package net.mgvyshinskiy.designpatterns.gof.visitor.visitors;

import net.mgvyshinskiy.designpatterns.gof.visitor.ClassicPizza;
import net.mgvyshinskiy.designpatterns.gof.visitor.RomanPizza;

public interface StuffVisitor {
    void visit(ClassicPizza pizza);

    void visit(RomanPizza pizza);
}
