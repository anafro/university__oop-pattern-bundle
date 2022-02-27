package ru.anafro.entities;

import java.util.Date;
import java.util.Random;

public class RealBank implements Bank {

    @Override
    public int getMoneyOf(String username) {
        if(!isAvailable())
            throw new RuntimeException("500: Bank is unavailable");

        return new Random().nextInt();
    }

    public boolean isAvailable() {
        return new Date().getHours() >= 8;
    }
}
