package net.mgvyshinskiy.designpatterns.gof.handlers;

import net.mgvyshinskiy.designpatterns.gof.CallService;
import net.mgvyshinskiy.designpatterns.gof.IncomingCall;

public class FireServiceCallHandler implements CallHandler {
    @Override
    public boolean handleCall(IncomingCall call) {
        if (call.getRequestedService().equals(CallService.FIRESERVICE)) {
            System.out.println("Firefighters on the way!");
            return true;
        }
        return false;
    }
}
