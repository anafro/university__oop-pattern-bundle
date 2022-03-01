package ru.anafro.patterns.behavioral.templatemethod;

import java.io.IOException;

public class AbstractProgram {
    private String filename;
    private ProgramExecutor executor;

    public AbstractProgram(String filename, ProgramExecutor executor) {
        this.filename = filename;
        this.executor = executor;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public ProgramExecutor getExecutor() {
        return executor;
    }

    public void setExecutor(ProgramExecutor executor) {
        this.executor = executor;
    }

    public void execute() throws IOException {
        executor.performExecution(filename);
    }
}
