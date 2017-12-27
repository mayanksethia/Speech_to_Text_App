package com.example.mayank.speechtotext;

/**
 * Created by mayank on 15-12-2017.
 */

public class User {

    public String name;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name) {
        this.name = name;

    }
}