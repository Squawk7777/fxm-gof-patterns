package net.mgvyshinskiy.designpatterns.gof.mediator;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher implements Mediator {
    Map<ServiceType, Service> services = new HashMap<>();

    @Override
    public void notify(ServiceType serviceType) {
        services.get(serviceType).acceptOrder();
    }

    @Override
    public void registerService(Service service) {
        services.put(service.getServiceType(), service);
    }
}
