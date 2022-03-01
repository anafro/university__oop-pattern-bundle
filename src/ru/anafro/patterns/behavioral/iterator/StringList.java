package ru.anafro.patterns.behavioral.iterator;

import ru.anafro.entities.StringJoinerService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Iterator
 */
public class StringList implements Iterable<String> {
    private final ArrayList<String> list = new ArrayList<>();
    private final StringJoinerService joiner = new StringJoinerService();

    public void add(String value) {
        list.add(value);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        list.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return list.spliterator();
    }

    @Override
    public String toString() {
        return joiner.join(list.toArray(String[]::new));
    }
}
