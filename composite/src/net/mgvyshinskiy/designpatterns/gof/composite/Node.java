package net.mgvyshinskiy.designpatterns.gof.composite;

import java.util.ArrayList;
import java.util.List;

public class Node implements Element {
    private List<Element> elements;

    public Node() {
        elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        elements.add(element);
        // to avoid cycling, here we should prevent adding ourselves / any top node
    }

    public Integer getCounter() {
        return elements.stream().mapToInt(Element::getCounter).sum();
    }

    public void incrementCounter() {
        elements.forEach(Element::incrementCounter);
    }

    public void decrementCounter() {
        elements.forEach(Element::decrementCounter);
    }
}
