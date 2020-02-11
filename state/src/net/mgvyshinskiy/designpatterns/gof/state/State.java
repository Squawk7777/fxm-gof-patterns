package net.mgvyshinskiy.designpatterns.gof.state;

public class State {
    public static void main(String[] args) {
        Oven oven = new Oven();

        oven.turnOff();
        oven.turnOn();
        oven.chill();
        oven.use();
        oven.use();
        oven.chill();
        oven.use();
        oven.turnOff();
    }
}
