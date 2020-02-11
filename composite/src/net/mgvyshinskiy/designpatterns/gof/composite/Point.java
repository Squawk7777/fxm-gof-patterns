package net.mgvyshinskiy.designpatterns.gof.composite;

public class Point implements Element {
    private Integer counter;

    public Point(Integer initialValue) {
        this.counter = initialValue;
    }

    public Integer getCounter() {
        return counter;
    }

    public void incrementCounter() {
        this.counter++;
    }

    public void decrementCounter() {
        this.counter--;
    }
}
