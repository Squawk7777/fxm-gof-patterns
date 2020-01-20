package net.mgvyshinskiy.designpatterns.gof.prototype;

public class Car extends Vehicle {
    public Car() {
        this.vehicleType = VehicleType.Car;
    }

    @Override
    public Car clone() {
        return (Car) super.clone();
    }
}
