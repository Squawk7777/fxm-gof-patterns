package net.mgvyshinskiy.designpatterns.gof.flyweight;

import java.util.List;

public class UnitSharedData {
    private List<String> soundFiles;
    private List<String> textures;

    public UnitSharedData(List<String> soundFiles, List<String> textures) {
        this.soundFiles = soundFiles;
        this.textures = textures;
    }
}
