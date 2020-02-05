package net.mgvyshinskiy.designpatterns.gof.mediator.services;

import net.mgvyshinskiy.designpatterns.gof.mediator.Mediator;

public class Taxi extends Service {
    public Taxi(Mediator mediator) {
        super(mediator);
        serviceType = ServiceType.TAXI;
    }

    public void acceptOrder() {
        System.out.println("Taxi on the way...");
    }
}
