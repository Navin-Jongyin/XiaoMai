package com.aoop.qiaomi_native.Models;

import java.util.ArrayList;

public class UserStatus {
    private String name, ProfileImage;
    private long lastUpdated;
    private ArrayList<Status> statuses;

    public UserStatus() {
    }

    public UserStatus(String name, String profileImage, long lastUpdate, ArrayList<Status> statuses) {
        this.name = name;
        ProfileImage = profileImage;
        this.lastUpdated = lastUpdate;
        this.statuses = statuses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }

    public long getLastUpdate() {
        return lastUpdated;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdated = lastUpdate;
    }

    public ArrayList<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(ArrayList<Status> statuses) {
        this.statuses = statuses;
    }
}
