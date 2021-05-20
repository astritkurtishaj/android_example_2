package com.example.projekti_2_zhvillim_app.models;

public class Food {

    private int foodImage;
    private String foodName;
    private String foodIngredients;
    private String foodPrice;

    public Food(int foodImage, String foodName, String foodIngredients, String foodPrice) {
        this.foodImage = foodImage;
        this.foodName = foodName;
        this.foodIngredients = foodIngredients;
        this.foodPrice = foodPrice;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodIngredients() {
        return foodIngredients;
    }

    public String getFoodPrice() {
        return foodPrice;
    }
}
