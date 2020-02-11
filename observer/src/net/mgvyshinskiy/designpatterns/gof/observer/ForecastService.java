package net.mgvyshinskiy.designpatterns.gof.observer;

import net.mgvyshinskiy.designpatterns.gof.observer.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class ForecastService implements Service {
    Set<Observer> observers = new HashSet<>();

    public void notifyObservers(String notification) {
        observers.forEach(observer -> observer.notify(notification));
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
