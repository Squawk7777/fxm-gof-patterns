package net.mgvyshinskiy.designpatterns.gof.mediator;

import net.mgvyshinskiy.designpatterns.gof.mediator.services.Service;
import net.mgvyshinskiy.designpatterns.gof.mediator.services.ServiceType;

public interface Mediator {
    void notify(ServiceType serviceType);

    void registerService(Service service);
}
