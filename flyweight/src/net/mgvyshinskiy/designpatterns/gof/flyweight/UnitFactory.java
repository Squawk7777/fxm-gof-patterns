package net.mgvyshinskiy.designpatterns.gof.flyweight;

import java.util.*;

public class UnitFactory {
    private static Map<Class<? extends Unit>, UnitSharedData> sharedData = new HashMap<>();

    public static <T extends Unit> T createUnit(Class<T> unitClass, UnitSharedData sharedData, Point startingPoint) throws ReflectiveOperationException {
        return unitClass.getDeclaredConstructor(UnitSharedData.class, Point.class).newInstance(sharedData, startingPoint);
    }

    public static UnitSharedData getUnitSharedData(Class<? extends Unit> unitClass, List<String> soundFiles, List<String> textures) {
        return sharedData.computeIfAbsent(unitClass, key -> new UnitSharedData(soundFiles, textures));
    }
}
