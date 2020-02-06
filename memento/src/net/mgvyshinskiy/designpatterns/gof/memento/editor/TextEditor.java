package net.mgvyshinskiy.designpatterns.gof.memento.editor;

import net.mgvyshinskiy.designpatterns.gof.memento.Snapshot;

public class TextEditor implements Editor {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public Snapshot createSnapshot() {
        return new EditorSnapshot(text);
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text = ((EditorSnapshot) snapshot).getText();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
