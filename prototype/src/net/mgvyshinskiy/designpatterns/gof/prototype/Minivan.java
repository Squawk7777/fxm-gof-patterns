package net.mgvyshinskiy.designpatterns.gof.prototype;

public class Minivan extends Vehicle implements Cloneable {
    public Minivan() {
        this.vehicleType = VehicleType.Minivan;
    }

    @Override
    public Minivan clone() {
        return (Minivan) super.clone();
    }
}
