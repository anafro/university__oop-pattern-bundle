package ru.anafro.patterns.behavioral.chainofresponsibility.entities;

public class Logs extends Material {
    private String variety;

    public Logs(String variety) {
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
