package ru.anafro.patterns.structural;

import ru.anafro.entities.User;

import java.util.ArrayList;

/**
 * Composite
 */
public final class Broadcaster {
    private final ArrayList<User> users = new ArrayList<>();

    public void sendMessage(String message) {
        for(var user : users) {
            user.sendMessage(message);
        }
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}

