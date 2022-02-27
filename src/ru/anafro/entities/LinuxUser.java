package ru.anafro.entities;

public class LinuxUser implements Animal {

    @Override
    public void talk() {
        System.out.println("Я люблю линукс и не стесняюсь этого!");
    }
}
