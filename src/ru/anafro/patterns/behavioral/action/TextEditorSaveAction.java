package ru.anafro.patterns.behavioral.action;

import ru.anafro.entities.TextEditor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextEditorSaveAction implements TextEditorAction {

    @Override
    public void perform(TextEditor editor) {
        var snapshot = editor.takeSnapshot();
        try {
            FileOutputStream outputStream = new FileOutputStream("save.textedit");
            outputStream.write(("\"" + snapshot.getContent() + "\", " + snapshot.getCaretPosition() + "").getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
