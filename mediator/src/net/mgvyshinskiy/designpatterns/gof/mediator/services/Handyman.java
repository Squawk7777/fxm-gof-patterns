package net.mgvyshinskiy.designpatterns.gof.mediator.services;

import net.mgvyshinskiy.designpatterns.gof.mediator.Mediator;

public class Handyman extends Service {
    public Handyman(Mediator mediator) {
        super(mediator);
        serviceType = ServiceType.HANDYMAN;
    }

    @Override
    public void acceptOrder() {
        System.out.println("Is your husband at home?");
    }
}
