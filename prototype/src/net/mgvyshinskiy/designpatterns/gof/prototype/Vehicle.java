package net.mgvyshinskiy.designpatterns.gof.prototype;

abstract class Vehicle implements Cloneable {
    protected VehicleType vehicleType;
    protected String color;
    protected String number;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public Vehicle clone() {
        Vehicle clone = null;
        try {
            clone = (Vehicle) super.clone();
            clone.setNumber("");
        } catch (CloneNotSupportedException e) {
        }
        return  clone;
    }
}
