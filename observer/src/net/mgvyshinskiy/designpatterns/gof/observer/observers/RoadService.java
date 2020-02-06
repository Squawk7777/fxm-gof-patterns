package net.mgvyshinskiy.designpatterns.gof.observer.observers;

public class RoadService implements Observer {
    @Override
    public void notify(String message) {
        System.out.println("Road service notified: " + message);
    }
}
