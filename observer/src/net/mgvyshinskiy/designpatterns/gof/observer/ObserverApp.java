package net.mgvyshinskiy.designpatterns.gof.observer;

import net.mgvyshinskiy.designpatterns.gof.observer.observers.Airport;
import net.mgvyshinskiy.designpatterns.gof.observer.observers.Observer;
import net.mgvyshinskiy.designpatterns.gof.observer.observers.RoadService;
import net.mgvyshinskiy.designpatterns.gof.observer.observers.School;

public class ObserverApp {
    public static void main(String[] args) {
        Observer school = new School();
        Observer airport = new Airport();
        Observer roadService = new RoadService();
        Service forecastService = new ForecastService();

        forecastService.addObserver(school);
        forecastService.addObserver(airport);
        forecastService.addObserver(roadService);

        forecastService.notifyObservers("Storm expected!");
    }
}
