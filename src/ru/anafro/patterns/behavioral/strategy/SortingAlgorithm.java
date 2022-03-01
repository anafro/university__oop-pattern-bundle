package ru.anafro.patterns.behavioral.strategy;

import java.util.Collection;

public interface SortingAlgorithm<T> {
    void sort(T[] array);
}
