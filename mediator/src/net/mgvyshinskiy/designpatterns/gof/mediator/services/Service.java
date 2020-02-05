package net.mgvyshinskiy.designpatterns.gof.mediator.services;

import net.mgvyshinskiy.designpatterns.gof.mediator.Mediator;

public abstract class Service {
    protected Mediator mediator;
    protected ServiceType serviceType;

    public Service(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void acceptOrder();

    public ServiceType getServiceType() {
        return serviceType;
    }
}
