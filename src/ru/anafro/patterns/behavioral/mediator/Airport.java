package ru.anafro.patterns.behavioral.mediator;

/**
 * Mediator (or Controller)
 */
public class Airport {
    private String name;

    public Airport(String name) {
        this.name = name;
    }

    public boolean isLandingAvailable() {
        return true;
    }

    public void askForLanding(Aircraft aircraft) {
        if(isLandingAvailable()) {
            aircraft.land();
        } else {
            aircraft.goAround();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
