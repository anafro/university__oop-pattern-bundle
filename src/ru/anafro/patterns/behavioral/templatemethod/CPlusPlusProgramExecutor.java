package ru.anafro.patterns.behavioral.templatemethod;

import java.io.IOException;

public class CPlusPlusProgramExecutor implements ProgramExecutor {
    
    @Override
    public void build(String filename) throws IOException {
        Runtime.getRuntime().exec("cmake --build " + filename + " -DFrom=CPlusPlusProgramExecutor.java");
    }

    @Override
    public void compile(String filename) throws IOException {
        Runtime.getRuntime().exec("g++ -Wall " + filename + ".cpp -o " + filename);
    }

    @Override
    public void execute(String filename) throws IOException {
        Runtime.getRuntime().exec(filename);
    }
}
