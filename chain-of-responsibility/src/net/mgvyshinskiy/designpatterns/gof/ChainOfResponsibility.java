package net.mgvyshinskiy.designpatterns.gof;

import net.mgvyshinskiy.designpatterns.gof.handlers.*;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        CallHandler fireService = new FireServiceCallHandler();
        CallHandler ambulance = new AmbulanceCallHandler();
        CallHandler police = new PoliceCallHandler();
        CallHandler pizza = new PizzaDeliveryCallHandler();
        CallHandler mistakes = new MistakenCallHandler();

        CallDispatcher dispatcher = new CallDispatcher();
        dispatcher.addHandler(fireService, ambulance, police, pizza, mistakes);

        IncomingCall pyromaniac = new IncomingCall(CallService.FIRESERVICE);
        IncomingCall hypochondriac = new IncomingCall(CallService.AMBULANCE);
        IncomingCall granny = new IncomingCall(CallService.POLICE);
        IncomingCall foodie = new IncomingCall(CallService.PIZZA);
        IncomingCall loneGunner = new IncomingCall(CallService.GIRLS);

        dispatcher.takeCall(pyromaniac);
        dispatcher.takeCall(hypochondriac);
        dispatcher.takeCall(granny);
        dispatcher.takeCall(foodie);
        dispatcher.takeCall(loneGunner);
    }
}
