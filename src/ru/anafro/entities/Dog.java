package ru.anafro.entities;

public class Dog implements Animal {

    @Override
    public void talk() {
        System.out.println("Гав-гав!");
    }
}
