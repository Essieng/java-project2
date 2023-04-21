package com.example.javaproject2.week1.day5;

public class User {
    String userName;
    String userPhoneNumber;
    int userAge;

    public User(String userName, String userPhoneNumber, int userAge) {
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.userAge = userAge;
    }

    public User() {

    }

    boolean isAdult() {
        return userAge >= 18;
    }
}
