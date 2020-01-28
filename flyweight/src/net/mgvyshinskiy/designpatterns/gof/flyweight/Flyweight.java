package net.mgvyshinskiy.designpatterns.gof.flyweight;

import java.util.Arrays;

public class Flyweight {
    public static void main(String[] args) throws ReflectiveOperationException {
        UnitSharedData tankSharedData = UnitFactory.getUnitSharedData(Tank.class,
                Arrays.asList("whoSummonedMe.wav", "stopRockingTheBoat.wav"), Arrays.asList("tank.png"));

        UnitSharedData infantrySharedData = UnitFactory.getUnitSharedData(Infantry.class,
                Arrays.asList("readyToServe.wav", "leaveMeAlone.wav"), Arrays.asList("infantry.png"));

        Point rallyPoint = new Point(20, 20);

        Tank tankOne = UnitFactory.createUnit(Tank.class, tankSharedData, rallyPoint);
        Tank tankTwo = UnitFactory.createUnit(Tank.class, tankSharedData, rallyPoint);

        Infantry infantrymanOne = UnitFactory.createUnit(Infantry.class, infantrySharedData, rallyPoint);
        Infantry infantrymanTwo = UnitFactory.createUnit(Infantry.class, infantrySharedData, rallyPoint);
        Infantry infantrymanThree = UnitFactory.createUnit(Infantry.class, infantrySharedData, rallyPoint);

        Army army = new Army(tankOne, tankTwo, infantrymanOne, infantrymanTwo, infantrymanThree);

        army.getUnits().forEach(unit -> System.out.println(unit.getCurrentPosition()));

        Point nextRallyPoint = new Point(10, 30);

        army.moveTo(nextRallyPoint);
        army.getUnits().forEach(unit -> System.out.println(unit.getMovingTo()));
        army.getUnits().forEach(unit -> System.out.println(unit.getSharedData()));
    }
}
