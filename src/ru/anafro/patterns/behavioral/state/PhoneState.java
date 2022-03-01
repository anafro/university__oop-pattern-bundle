package ru.anafro.patterns.behavioral.state;

import ru.anafro.entities.Phone;

public abstract class PhoneState {
    private Phone phone;

    public PhoneState(Phone phone) {
        this.phone = phone;
    }

    public abstract void clickPowerButton();
    public abstract void doubleClickPowerButton();
    public abstract void clickVolumeUpButton();
    public abstract void clickVolumeDownButton();

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
