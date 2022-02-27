package ru.anafro.entities;

import java.io.IOException;

@FunctionalInterface
public interface StringReader {
    String read() throws IOException;
}
