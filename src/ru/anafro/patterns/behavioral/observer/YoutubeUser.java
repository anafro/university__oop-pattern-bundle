package ru.anafro.patterns.behavioral.observer;

public class YoutubeUser {
    private String name;

    public YoutubeUser(String name) {
        this.name = name;
    }

    void subscribeTo(YoutubeChannel channel) {
        channel.addSubscriber(this);
    }

    void onVideoEvent(YoutubeChannel channel, String title) {
        System.out.println("Notification for " + name + ": Youtuber " + channel.getName() + " published a new video '" + title + "'.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
