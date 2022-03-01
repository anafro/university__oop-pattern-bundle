package ru.anafro.patterns.behavioral.chainofresponsibility;

import ru.anafro.patterns.behavioral.chainofresponsibility.entities.Material;

public abstract class MaterialHandler {
    private MaterialHandler next;

    public abstract Material handle(Material material);

    public MaterialHandler getNext() {
        return next;
    }

    public void setNext(MaterialHandler next) {
        this.next = next;
    }
}
