package net.mgvyshinskiy.designpatterns.gof.visitor;

import net.mgvyshinskiy.designpatterns.gof.visitor.visitors.StuffVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

abstract public class AbstractPizza {
    private List<Stuffing> stuffing = new ArrayList<>();

    abstract void accept(StuffVisitor visitor);

    public void addStuffing(Stuffing stuffing) {
        this.stuffing.add(stuffing);
    }

    public String getRecipe() {
        return this.stuffing.stream().map(Stuffing::toString).collect(Collectors.joining(", "));
    }
}
