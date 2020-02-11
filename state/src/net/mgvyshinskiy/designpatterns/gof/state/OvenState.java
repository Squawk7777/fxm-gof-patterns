package net.mgvyshinskiy.designpatterns.gof.state;

interface OvenState {
    void turnOn();

    void use();

    void chill();

    void turnOff();
}
