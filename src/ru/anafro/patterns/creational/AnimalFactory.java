package ru.anafro.patterns.creational;

import ru.anafro.entities.Animal;
import ru.anafro.entities.Cat;
import ru.anafro.entities.Dog;
import ru.anafro.entities.LinuxUser;

import java.util.Locale;

/**
 * Factory
 */
public final class AnimalFactory {
    private AnimalFactory() {}

    public static Animal makeAnimal(String name) {
        return switch (name.toLowerCase(Locale.ROOT)) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            case "linux" -> new LinuxUser();
            default -> throw new UnsupportedOperationException("Cannot make an animal with name " + name + ".");
        };
    }
}
