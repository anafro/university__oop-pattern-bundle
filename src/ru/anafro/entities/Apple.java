package ru.anafro.entities;

import java.awt.*;

public class Apple {
    private String variety;
    private Color color;

    public Apple(String variety, Color color) {
        this.variety = variety;
        this.color = color;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
