package net.mgvyshinskiy.designpatterns.gof.handlers;

import net.mgvyshinskiy.designpatterns.gof.IncomingCall;

public interface CallHandler {
    boolean handleCall(IncomingCall call);
}
