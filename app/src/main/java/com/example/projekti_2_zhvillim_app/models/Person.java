package com.example.projekti_2_zhvillim_app.models;

public class Person {

    private int profileImage;
    private String name;
    private String surname;


    public Person(int profileImage, String name, String surname) {
        this.profileImage = profileImage;
        this.name = name;
        this.surname = surname;
    }

    public int getProfileImage() {
        return profileImage;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
