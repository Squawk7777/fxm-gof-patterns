package net.mgvyshinskiy.designpatterns.gof.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<Stuffing> stuffing = new ArrayList<>();

    public void addStuffing(Stuffing stuffing) {
        this.stuffing.add(stuffing);
    }

    public void removeStuffing(Stuffing stuffing) {
        this.stuffing.remove(stuffing);
    }
}
