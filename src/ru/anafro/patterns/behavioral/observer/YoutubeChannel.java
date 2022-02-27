package ru.anafro.patterns.behavioral.observer;

import java.util.ArrayList;

public class YoutubeChannel {
    private final ArrayList<YoutubeUser> subscribers = new ArrayList<>();
    private final String name;

    public YoutubeChannel(String name) {
        this.name = name;
    }

    public void publishVideo(String title) {
        // Adding the video to a channel...

        for(var subscriber : subscribers) {
            subscriber.onVideoEvent(this, title);
        }
    }

    public void addSubscriber(YoutubeUser subscriber) {
        subscribers.add(subscriber);
    }

    public ArrayList<YoutubeUser> getSubscribers() {
        return subscribers;
    }

    public String getName() {
        return name;
    }
}
