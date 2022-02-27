package ru.anafro.patterns.structural;

import ru.anafro.entities.Apple;

import java.util.ArrayList;

/**
 * Flyweight (see Apple)
 */
public class AppleGenerator {
    private AppleContext context;

    public AppleGenerator(AppleContext context) {
        this.context = context;
    }

    public ArrayList<Apple> generate(int count) {
        if(count < 0)
            throw new IllegalArgumentException("Cannot generate negative amount of apples");

        ArrayList<Apple> generatedApples = new ArrayList<>();

        for(int i = 0; i < count; i++) {
            generatedApples.add(new Apple(context.getVariety(), context.getColor()));
        }

        return generatedApples;
    }

    public AppleContext getContext() {
        return context;
    }

    public void setContext(AppleContext context) {
        this.context = context;
    }
}
