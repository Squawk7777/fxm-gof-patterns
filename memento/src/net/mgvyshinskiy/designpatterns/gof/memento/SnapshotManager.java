package net.mgvyshinskiy.designpatterns.gof.memento;

import net.mgvyshinskiy.designpatterns.gof.memento.editor.Editor;
import net.mgvyshinskiy.designpatterns.gof.memento.editor.TextEditor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SnapshotManager<T extends Editor> {
    private Map<LocalDateTime, Snapshot> snapshots = new HashMap<>();

    public LocalDateTime createSnapshot(T editor) {
        LocalDateTime snapshotDateTime = LocalDateTime.now();
        snapshots.put(snapshotDateTime, editor.createSnapshot());
        System.out.println("Stored state at: " + snapshotDateTime);

        return snapshotDateTime;
    }

    public void restoreSnapshot(T editor, LocalDateTime dateTime) {
        if (snapshots.containsKey(dateTime)) {
            System.out.println("Restored state at: " + dateTime);
            editor.restoreSnapshot(snapshots.get(dateTime));
        }
    }
}
