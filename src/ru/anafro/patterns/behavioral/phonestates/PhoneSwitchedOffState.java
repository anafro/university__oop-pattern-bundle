package ru.anafro.patterns.behavioral.phonestates;

import ru.anafro.entities.Phone;
import ru.anafro.patterns.behavioral.PhoneState;

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
