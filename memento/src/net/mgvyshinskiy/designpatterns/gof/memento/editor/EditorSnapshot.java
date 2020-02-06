package net.mgvyshinskiy.designpatterns.gof.memento.editor;

import net.mgvyshinskiy.designpatterns.gof.memento.Snapshot;

class EditorSnapshot implements Snapshot {
    private String text;

    EditorSnapshot(String text) {
        this.text = text;
    }

    // package-private
    String getText() {
        return text;
    }
}
