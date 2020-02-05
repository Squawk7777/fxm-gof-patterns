package net.mgvyshinskiy.designpatterns.gof.mediator;

public interface Mediator {
    void notify(ServiceType serviceType);

    void registerService(Service service);
}
