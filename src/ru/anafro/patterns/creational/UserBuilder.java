package ru.anafro.patterns.creational;

import ru.anafro.entities.User;

/**
 * Builder
 */
public class UserBuilder {
    private String name;
    private String password;
    private int age;

    public UserBuilder() {}

    UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    User build() {
        if(name == null)
            throw new UnsupportedOperationException("Name of the user should be provided");

        if(password == null)
            throw new UnsupportedOperationException("Password of the user should be provided");

        return new User(name, password, age);
    }
}
