package ru.anafro.patterns.behavioral.action;

import ru.anafro.entities.TextEditor;

@FunctionalInterface
public interface TextEditorAction {
    void perform(TextEditor editor);
}
