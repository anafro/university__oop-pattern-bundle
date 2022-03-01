package ru.anafro.patterns.behavioral.strategy;

public class Array<T> {
    private final T[] array;
    private SortingAlgorithm<T> sortingAlgorithm;

    @SafeVarargs
    public Array(T... values) {
        this.array = values;
    }

    public void sort() {
        sortingAlgorithm.sort(array);
    }
}
