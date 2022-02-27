package ru.anafro.patterns.structural;

import ru.anafro.entities.Bank;
import ru.anafro.entities.RealBank;

public class BankProxy implements Bank {
    private RealBank realBank;

    public BankProxy(RealBank realBank) {
        this.realBank = realBank;
    }

    public RealBank getRealBank() {
        return realBank;
    }

    public void setRealBank(RealBank realBank) {
        this.realBank = realBank;
    }

    @Override
    public int getMoneyOf(String username) {
        if(realBank.isAvailable())
            return realBank.getMoneyOf(username);
        else
            throw new UnsupportedOperationException("Real bank is not available yet");
    }
}
