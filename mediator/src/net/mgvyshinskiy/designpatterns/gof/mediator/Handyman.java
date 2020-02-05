package net.mgvyshinskiy.designpatterns.gof.mediator;

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
