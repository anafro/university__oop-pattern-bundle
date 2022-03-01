package ru.anafro.patterns.behavioral.templatemethod;

import java.io.IOException;

public interface ProgramExecutor {
    default void performExecution(String filename) throws IOException {
        build(filename);
        compile(filename);
        execute(filename);
    }

    void build(String filename) throws IOException;
    void compile(String filename) throws IOException;
    void execute(String filename) throws IOException;
}
