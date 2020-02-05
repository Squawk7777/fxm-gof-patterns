package net.mgvyshinskiy.designpatterns.gof;

import net.mgvyshinskiy.designpatterns.gof.handlers.CallHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CallDispatcher {
    List<CallHandler> callHandlers = new ArrayList<>();

    public boolean takeCall(IncomingCall call) {
        return callHandlers.stream().anyMatch(handler -> handler.handleCall(call));
    }

    public void addHandler(CallHandler... handlers) {
        callHandlers.addAll(Arrays.asList(handlers));
    }
}
