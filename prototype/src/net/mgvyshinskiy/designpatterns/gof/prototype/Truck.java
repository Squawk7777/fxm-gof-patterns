package net.mgvyshinskiy.designpatterns.gof.prototype;

public class Truck extends Vehicle {
    public Truck() {
        this.vehicleType = VehicleType.Truck;
    }

    @Override
    public Truck clone() {
        return (Truck) super.clone();
    }
}
