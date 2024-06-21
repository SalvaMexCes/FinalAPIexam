package com.example.FinalAPI.domain;

public class User {

    private long id;
    private String username;
    private Enum gender;

    public User(long id, String username, Enum gender) {
        this.id = id;
        this.username = username;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }
}
