package com.example.projekti_2_zhvillim_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;


import com.example.projekti_2_zhvillim_app.R;
import com.example.projekti_2_zhvillim_app.adapters.DrinkAdapter;
import com.example.projekti_2_zhvillim_app.adapters.FoodAdapter;
import com.example.projekti_2_zhvillim_app.models.Drink;
import com.example.projekti_2_zhvillim_app.models.Food;

import java.util.ArrayList;

public class GridViewActivity extends AppCompatActivity {

    GridView drinkGridView;
    ArrayList<Drink> drinkArrayList = new ArrayList<>();
    DrinkAdapter drinkAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        drinkGridView = findViewById(R.id.idGridView);

        Intent intent = getIntent();
        if(intent != null){
            String foodName = intent.getStringExtra("foodName");
            String foodIngredients = intent.getStringExtra("foodIngredients");
            String foodPrice = intent.getStringExtra("foodPrice");
            System.out.printf("Te dhenat ne ardhje jane: %s %s %s", foodName, foodIngredients, foodPrice);
        }else {
            System.out.println("Nuk ka te dhena ne ardhje");
        }

        drinkArrayList.add(new Drink(R.mipmap.profile, intent.getStringExtra("foodName")));
        drinkArrayList.add(new Drink(R.mipmap.profile, "Qaj"));
        drinkArrayList.add(new Drink(R.mipmap.profile, "Kapuqino"));
        drinkArrayList.add(new Drink(R.mipmap.profile, "Americane"));
        drinkArrayList.add(new Drink(R.mipmap.profile, "NesCafe"));
        drinkArrayList.add(new Drink(R.mipmap.profile, "Qaj i Zi"));
        drinkAdapter = new DrinkAdapter(this, drinkArrayList);
        drinkGridView.setAdapter(drinkAdapter);

    }
}