package net.mgvyshinskiy.designpatterns.gof.memento;

import net.mgvyshinskiy.designpatterns.gof.memento.editor.TextEditor;

import java.time.LocalDateTime;

public class Memento {
    public static void main(String[] args) throws InterruptedException {
        TextEditor editor = new TextEditor("initial text");
        SnapshotManager<TextEditor> snapshotManager = new SnapshotManager<>();
        LocalDateTime firstSnapshotTime = snapshotManager.createSnapshot(editor);

        Thread.sleep(50);
        editor.setText("updated text");
        LocalDateTime secondSnapshotTime = snapshotManager.createSnapshot(editor);

        Thread.sleep(75);
        editor.setText("brand new text");
        System.out.println(editor.getText());

        snapshotManager.restoreSnapshot(editor, firstSnapshotTime);
        System.out.println(editor.getText());

        snapshotManager.restoreSnapshot(editor, secondSnapshotTime);
        System.out.println(editor.getText());
    }
}
