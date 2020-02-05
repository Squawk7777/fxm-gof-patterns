package net.mgvyshinskiy.designpatterns.gof.mediator;

public class Concierge extends Service {
    public Concierge(Mediator mediator) {
        super(mediator);
        serviceType = ServiceType.CONCIERGE;
    }

    public void requestService(ServiceType serviceType) {
        mediator.notify(serviceType);
    }

    @Override
    public void acceptOrder() {
        System.out.println("Concierge is listening...");
    }
}
