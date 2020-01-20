package net.mgvyshinskiy.designpatterns.gof.prototype;

public class Prototype {
    public static void main(String[] args) {
        Minivan redMinivanOne = new Minivan();
        redMinivanOne.setColor("Red");
        redMinivanOne.setNumber("A12345B");

        Minivan redMinivanTwo = redMinivanOne.clone();

        System.out.println(redMinivanTwo.getVehicleType());
        System.out.println(redMinivanTwo.getColor());
        System.out.println(redMinivanTwo.getNumber().isEmpty()); // should not be cloned
    }
}
