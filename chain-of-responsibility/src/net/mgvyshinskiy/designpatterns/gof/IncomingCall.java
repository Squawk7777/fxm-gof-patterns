package net.mgvyshinskiy.designpatterns.gof;

public class IncomingCall {
    private CallService requestedService;

    public IncomingCall(CallService requestedService) {
        this.requestedService = requestedService;
    }

    public CallService getRequestedService() {
        return requestedService;
    }
}
