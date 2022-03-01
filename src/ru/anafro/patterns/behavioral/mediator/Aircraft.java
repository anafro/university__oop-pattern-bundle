package ru.anafro.patterns.behavioral.mediator;

public class Aircraft {
    private String model, number;

    public Aircraft(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public void land() {
        //
    }

    public void goAround() {
        //
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
