package net.mgvyshinskiy.designpatterns.gof.memento.editor;

import net.mgvyshinskiy.designpatterns.gof.memento.Snapshot;

public interface Editor {
    Snapshot createSnapshot();

    void restoreSnapshot(Snapshot snapshot);
}
