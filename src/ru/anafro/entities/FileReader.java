package ru.anafro.entities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileReader implements StringReader {
    private String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String read() throws IOException {
        return Files.readString(new File(filename).toPath());
    }
}
