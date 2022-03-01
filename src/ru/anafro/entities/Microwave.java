package ru.anafro.entities;

import ru.anafro.patterns.creational.prototype.Food;

public class Microwave {
    private Food content = null;
    private int cookingTime = 0;
    private int watts = 0;
    private String mode = "Default mode";

    public Food getContent() {
        return content;
    }

    public void setContent(Food content) {
        this.content = content;
    }

    public void launch() {
        System.out.println("Microwave is launched");
    }

    public void waitUntilCooked() {
        System.out.println("Wait for it");

        try {
            Thread.sleep(cookingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ding! Cooking is done!");
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
