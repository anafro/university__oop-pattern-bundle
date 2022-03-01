package ru.anafro.patterns.behavioral.snapshot;

public class TextEditorSnapshot {
    private String content;
    private int caretPosition;

    public TextEditorSnapshot(String content, int caretPosition) {
        this.content = content;
        this.caretPosition = caretPosition;
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
}
