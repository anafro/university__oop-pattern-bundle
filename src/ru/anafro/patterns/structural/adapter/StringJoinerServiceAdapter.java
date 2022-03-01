package ru.anafro.patterns.structural.adapter;

import ru.anafro.entities.StringJoinerService;

public class StringJoinerServiceAdapter {
    private StringJoinerService service;

    public StringJoinerServiceAdapter() {
        service = new StringJoinerService();
    }

    String join(String commaSeparatedEntries) {
        return service.join(commaSeparatedEntries.split(","));
    }

    public StringJoinerService getService() {
        return service;
    }

    public void setService(StringJoinerService service) {
        this.service = service;
    }
}
