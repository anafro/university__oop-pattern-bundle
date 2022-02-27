package ru.anafro.entities;

public class Cat implements Animal {

    @Override
    public void talk() {
        System.out.println("Мяу-мяу!");
    }
}
