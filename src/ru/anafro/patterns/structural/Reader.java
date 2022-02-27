package ru.anafro.patterns.structural;

import ru.anafro.entities.FileReader;
import ru.anafro.entities.UrlReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Facade
 */
public final class Reader {
    String read(String source) throws IOException {
        try {
            return new UrlReader(new URL(source)).read();
        } catch(MalformedURLException exception) {
            return new FileReader(source).read();
        }
    }
}
