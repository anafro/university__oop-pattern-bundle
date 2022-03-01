package ru.anafro.patterns.behavioral.templatemethod;

import java.io.IOException;

public class JavaProgramExecutor implements ProgramExecutor {

    @Override
    public void build(String filename) throws IOException {
        // No build required.
    }

    @Override
    public void compile(String filename) throws IOException {
        Runtime.getRuntime().exec("javac " + filename + ".java");
    }

    @Override
    public void execute(String filename) throws IOException {
        Runtime.getRuntime().exec("java " + filename);
    }
}
