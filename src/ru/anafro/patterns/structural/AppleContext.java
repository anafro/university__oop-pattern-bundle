package ru.anafro.patterns.structural;

import java.awt.*;

public class AppleContext {
    private String variety;
    private Color color;

    public AppleContext(String variety, Color color) {
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
