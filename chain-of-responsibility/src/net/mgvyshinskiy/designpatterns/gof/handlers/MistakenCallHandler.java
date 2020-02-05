package net.mgvyshinskiy.designpatterns.gof.handlers;

import net.mgvyshinskiy.designpatterns.gof.IncomingCall;

public class MistakenCallHandler implements CallHandler {
    @Override
    public boolean handleCall(IncomingCall call) {
        System.out.println("Unfortunately, we can’t help you. *hangs*");
        return true;
    }
}
