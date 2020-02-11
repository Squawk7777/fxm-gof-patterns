package net.mgvyshinskiy.designpatterns.gof.handlers;

import net.mgvyshinskiy.designpatterns.gof.CallService;
import net.mgvyshinskiy.designpatterns.gof.IncomingCall;

public class AmbulanceCallHandler implements CallHandler {
    @Override
    public boolean handleCall(IncomingCall call) {
        if (call.getRequestedService().equals(CallService.AMBULANCE)) {
            System.out.println("Have you tried turning it off and on again?");
            return true;
        }
        return false;
    }
}
