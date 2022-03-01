package ru.anafro.patterns.behavioral.chainofresponsibility.entities;

public class Wood extends Material {
    private String variety;

    public Wood(String variety) {
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
