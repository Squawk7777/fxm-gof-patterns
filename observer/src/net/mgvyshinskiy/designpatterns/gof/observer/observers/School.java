package net.mgvyshinskiy.designpatterns.gof.observer.observers;

public class School implements Observer {
    @Override
    public void notify(String message) {
        System.out.println("School notified: " + message);
    }
}
