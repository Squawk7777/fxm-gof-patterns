package net.mgvyshinskiy.designpatterns.gof.singletone;

import java.util.*;
import java.util.stream.IntStream;

public class Singletone {
    private static int MAX_INSTANCES = 10;
    private static final List<Singletone> instances = new ArrayList<>();

    static {
        IntStream.range(0, MAX_INSTANCES).forEach(n -> instances.add(new Singletone()));
    }

    private Singletone() {
    }

    public static Singletone getInstance() {
        int randomIndex = new Random().nextInt(instances.size()); // kinda dumb load balancing
        return instances.get(randomIndex);
    }
}
