package ru.anafro.entities;

import ru.anafro.patterns.behavioral.state.PhoneState;
import ru.anafro.patterns.behavioral.state.PhoneSwitchedOffState;

public class Phone {
    private PhoneState state = new PhoneSwitchedOffState(this);
    private int volume = 50;

    public void clickPowerButton() {
        state.clickPowerButton();
    }

    public void doubleClickPowerButton() {
        state.doubleClickPowerButton();
    }

    public void clickVolumeUpButton() {
        state.clickVolumeUpButton();
    }

    public void clickVolumeDownButton() {
        state.clickVolumeDownButton();
    }

    public PhoneState getState() {
        return state;
    }

    public int getVolume() {
        return volume;
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
