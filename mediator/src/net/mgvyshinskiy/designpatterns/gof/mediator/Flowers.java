package net.mgvyshinskiy.designpatterns.gof.mediator;

public class Flowers extends Service {
    public Flowers(Mediator mediator) {
        super(mediator);
        serviceType = ServiceType.FLOWERS;
    }

    public void acceptOrder() {
        System.out.println("Get your bouquet today!");
    }
}
