package ru.anafro.patterns.behavioral.action;

import ru.anafro.entities.TextEditor;

public class TextEditorClearAction implements TextEditorAction {

    @Override
    public void perform(TextEditor editor) {
        editor.setContent("");
    }
}
