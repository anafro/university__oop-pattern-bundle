package ru.anafro.patterns.creational;

/**
 * Singleton
 */
public final class Application {
    private static Application instance;

    private Application() {}

    public static Application getInstance() {
        if(instance == null) {
            instance = new Application();
        }

        return instance;
    }
}
