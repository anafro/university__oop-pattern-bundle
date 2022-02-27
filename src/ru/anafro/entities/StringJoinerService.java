package ru.anafro.entities;

import java.util.ArrayList;

public final class StringJoinerService {
    public String join(String[] entries) {
        return String.join("", entries);
    }
}
