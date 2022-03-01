package ru.anafro.patterns.behavioral.templatemethod;

public class JavaProgram extends AbstractProgram {
    public JavaProgram(String filename) {
        super(filename, new JavaProgramExecutor());
    }
}
