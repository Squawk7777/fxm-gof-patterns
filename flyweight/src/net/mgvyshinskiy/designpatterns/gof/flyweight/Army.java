package net.mgvyshinskiy.designpatterns.gof.flyweight;

import java.util.*;

public class Army {
    private Set<Unit> units;

    public Army(Unit ... units) {
        this.units = new HashSet<>(Arrays.asList(units));
    }

    public Set<Unit> getUnits() {
        return units;
    }

    public void moveTo(Point rallyPoint) {
        units.forEach(unit -> unit.setMovingTo(rallyPoint));
    }
}
