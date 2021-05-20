package com.example.projekti_2_zhvillim_app.models;

public class Drink {

    private int drinkImage;
    private String drinkName;

    public Drink(int drinkImage, String drinkName) {
        this.drinkImage = drinkImage;
        this.drinkName = drinkName;
    }

    public int getDrinkImage() {
        return drinkImage;
    }

    public String getDrinkName() {
        return drinkName;
    }
}
