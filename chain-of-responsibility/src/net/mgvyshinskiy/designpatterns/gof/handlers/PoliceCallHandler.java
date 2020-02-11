package net.mgvyshinskiy.designpatterns.gof.handlers;

import net.mgvyshinskiy.designpatterns.gof.CallService;
import net.mgvyshinskiy.designpatterns.gof.IncomingCall;

public class PoliceCallHandler implements CallHandler {
    @Override
    public boolean handleCall(IncomingCall call) {
        if (call.getRequestedService().equals(CallService.POLICE)) {
            System.out.println("Which tree does your cat sit on?");
            return true;
        }
        return false;
    }
}
