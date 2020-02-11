package net.mgvyshinskiy.designpatterns.gof.flyweight;

public abstract class Unit {
    private Point movingTo;
    private Point currentPosition;
    private UnitSharedData sharedData;

    public Unit(UnitSharedData sharedData, Point currentPosition) {
        this.sharedData = sharedData;
        this.currentPosition = currentPosition;
    }

    public Point getMovingTo() {
        return movingTo;
    }

    public void setMovingTo(Point movingTo) {
        this.movingTo = movingTo;
    }

    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public UnitSharedData getSharedData() {
        return sharedData;
    }
}
