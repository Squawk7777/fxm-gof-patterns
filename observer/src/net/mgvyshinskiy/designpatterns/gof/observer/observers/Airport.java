package net.mgvyshinskiy.designpatterns.gof.observer.observers;

public class Airport implements Observer {
    @Override
    public void notify(String message) {
        System.out.println("Airport notified: " + message);
    }
}
