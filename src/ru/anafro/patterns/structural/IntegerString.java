package ru.anafro.patterns.structural;

/**
 * Decorator
 */
public class IntegerString {
    private String string;

    public IntegerString(String string) {
        this.string = string;
    }

    int toInteger() {
        try {
            return Integer.parseInt(string);
        } catch(NumberFormatException exception) {
            return 0;
        }
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
