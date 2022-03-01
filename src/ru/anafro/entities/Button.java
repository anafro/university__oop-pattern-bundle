package ru.anafro.entities;

import java.awt.*;

public class Button {
    private String title;
    private Color color;

    public Button(String title, Color color) {
        this.title = title;
        this.color = color;
    }

    public void performOnClick(Runnable runnable) {
        //
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
