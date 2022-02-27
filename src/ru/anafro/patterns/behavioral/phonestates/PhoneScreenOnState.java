package ru.anafro.patterns.behavioral.phonestates;

import ru.anafro.entities.Phone;
import ru.anafro.patterns.behavioral.PhoneState;

public class PhoneScreenOnState extends PhoneState {
    public PhoneScreenOnState(Phone phone) {
        super(phone);
    }

    @Override
    public void clickPowerButton() {
        getPhone().setState(new PhoneSleepState(getPhone()));
    }

    @Override
    public void doubleClickPowerButton() {
        getPhone().setState(new PhoneSwitchedOffState(getPhone()));
    }

    @Override
    public void clickVolumeUpButton() {
        getPhone().setVolume(getPhone().getVolume() + 1);
    }

    @Override
    public void clickVolumeDownButton() {
        getPhone().setVolume(getPhone().getVolume() - 1);
    }
}
