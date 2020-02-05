package net.mgvyshinskiy.designpatterns.gof.handlers;

import net.mgvyshinskiy.designpatterns.gof.CallService;
import net.mgvyshinskiy.designpatterns.gof.IncomingCall;

public class PizzaDeliveryCallHandler implements CallHandler {
    @Override
    public boolean handleCall(IncomingCall call) {
        if (call.getRequestedService().equals(CallService.PIZZA)) {
            System.out.println("With double cheese and pepperoni?");
            return true;
        }
        return false;
    }
}
