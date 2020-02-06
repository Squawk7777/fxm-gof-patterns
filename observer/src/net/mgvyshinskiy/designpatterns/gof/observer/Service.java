package net.mgvyshinskiy.designpatterns.gof.observer;

import net.mgvyshinskiy.designpatterns.gof.observer.observers.Observer;

public interface Service {
    void notifyObservers(String notification);

    void addObserver(Observer observer);

    void removeObserver(Observer observer);
}
