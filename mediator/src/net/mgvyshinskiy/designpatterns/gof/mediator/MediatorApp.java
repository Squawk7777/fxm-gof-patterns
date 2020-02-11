package net.mgvyshinskiy.designpatterns.gof.mediator;

import net.mgvyshinskiy.designpatterns.gof.mediator.services.*;

public class MediatorApp {
    public static void main(String[] args) {
        Mediator mediator = new Dispatcher();

        Concierge concierge = new Concierge(mediator);
        Service taxi = new Taxi(mediator);
        Service handyman = new Handyman(mediator);
        Service flowers = new Flowers(mediator);

        mediator.registerService(concierge);
        mediator.registerService(taxi);
        mediator.registerService(handyman);
        mediator.registerService(flowers);

        concierge.requestService(ServiceType.HANDYMAN);
        concierge.requestService(ServiceType.FLOWERS);
        concierge.requestService(ServiceType.TAXI);
    }
}
