package ru.anafro.patterns.behavioral.state;

import ru.anafro.entities.Phone;

public class PhoneSwitchedOffState extends PhoneState {
    public PhoneSwitchedOffState(Phone phone) {
        super(phone);
    }

    @Override
    public void clickPowerButton() {
        // Do nothing.
    }

    @Override
    public void doubleClickPowerButton() {
        getPhone().setState(new PhoneScreenOnState(getPhone()));
    }

    @Override
    public void clickVolumeUpButton() {
        // Do nothing.
    }

    @Override
    public void clickVolumeDownButton() {
        // Do nothing.
    }
}
