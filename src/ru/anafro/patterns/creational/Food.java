package ru.anafro.patterns.creational;

/**
 * Prototype
 */
public class Food implements Cloneable {
    private double fat, protein, carbohydrates;
    private String name;

    public Food(double fat, double protein, double carbohydrates, String name) {
        this.fat = fat;
        this.protein = protein;
        this.carbohydrates = carbohydrates;
        this.name = name;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Food clone() {
        try {
            Food clone = (Food) super.clone();

            clone.setName(name);
            clone.setFat(fat);
            clone.setProtein(protein);
            clone.setCarbohydrates(carbohydrates);

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
