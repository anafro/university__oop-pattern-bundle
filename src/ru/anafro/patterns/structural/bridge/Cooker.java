package ru.anafro.patterns.structural.bridge;

import ru.anafro.entities.Microwave;
import ru.anafro.patterns.creational.prototype.Food;

/**
 * Bridge
 */
public class Cooker {
    private final Microwave microwave;

    public Cooker(Microwave microwave) {
        this.microwave = microwave;
    }

    public Food cook(Food rawFood) {
        microwave.setContent(rawFood);
        microwave.setCookingTime(90);
        microwave.setMode("Heat up " + rawFood.getName());
        microwave.setWatts(900);
        microwave.launch();
        microwave.waitUntilCooked();
        return microwave.getContent();
    }
}
