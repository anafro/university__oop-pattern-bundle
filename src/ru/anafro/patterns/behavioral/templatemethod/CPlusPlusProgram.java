package ru.anafro.patterns.behavioral.templatemethod;

public class CPlusPlusProgram extends AbstractProgram {
    public CPlusPlusProgram(String filename) {
        super(filename, new CPlusPlusProgramExecutor());
    }
}
