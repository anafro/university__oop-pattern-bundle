package ru.anafro.entities;

import ru.anafro.entities.Button;
import ru.anafro.patterns.behavioral.action.TextEditorAction;
import ru.anafro.patterns.behavioral.action.TextEditorClearAction;
import ru.anafro.patterns.behavioral.action.TextEditorSaveAction;
import ru.anafro.patterns.behavioral.snapshot.TextEditorSnapshot;

import java.awt.*;
import java.util.ArrayList;

/**
 * Action and Snapshot
 */
public class TextEditor {
    private String content;
    private int caretPosition;
    private final transient Button saveButton = new Button("Save", Color.GREEN);
    private final transient Button clearButton = new Button("Clear", Color.GRAY);
    private final transient ArrayList<TextEditorAction> actionHistory = new ArrayList<>();

    public TextEditor(String content, int caretPosition) {
        this.content = content;
        this.caretPosition = caretPosition;

        saveButton.performOnClick(() -> new TextEditorClearAction().perform(this));
        clearButton.performOnClick(() -> new TextEditorSaveAction().perform(this));
    }

    public TextEditor(TextEditorSnapshot snapshot) {
        this.content = snapshot.getContent();
        this.caretPosition = snapshot.getCaretPosition();
    }

    public TextEditorSnapshot takeSnapshot() {
        return new TextEditorSnapshot(content, caretPosition);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCaretPosition() {
        return caretPosition;
    }

    public void setCaretPosition(int caretPosition) {
        this.caretPosition = caretPosition;
    }

    public ArrayList<TextEditorAction> getActionHistory() {
        return actionHistory;
    }
}
