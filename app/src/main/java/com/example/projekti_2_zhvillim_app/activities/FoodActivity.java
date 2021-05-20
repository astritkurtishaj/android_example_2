package com.example.projekti_2_zhvillim_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.projekti_2_zhvillim_app.R;
import com.example.projekti_2_zhvillim_app.adapters.FoodAdapter;
import com.example.projekti_2_zhvillim_app.models.Food;
import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
    ListView foodListView;
    ArrayList<Food> foodArrayList = new ArrayList<>();
    FoodAdapter foodAdapter;
    Button buttonAddFood;
    EditText editTextFoodName, editTextFoodIngredients, editTextFoodPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        foodListView = findViewById(R.id.foodListView);

        buttonAddFood = findViewById(R.id.btnAddFood);
        editTextFoodName = findViewById(R.id.etFoodType);
        editTextFoodIngredients = findViewById(R.id.etIngredients);
        editTextFoodPrice = findViewById(R.id.etPrice);


        foodAdapter = new FoodAdapter(this, foodArrayList);


        buttonAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodArrayList.add(0, new Food(R.mipmap.profile, editTextFoodName.getText().toString(),editTextFoodIngredients.getText().toString(),editTextFoodPrice.getText().toString()));
                foodAdapter.notifyDataSetChanged();
                editTextFoodName.setText("");
                editTextFoodIngredients.setText("");
                editTextFoodPrice.setText("");
            }
        });

        View headerView = ((LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE)).inflate(R.layout.header,null,false);

        foodListView.addHeaderView(headerView);

        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(FoodActivity.this, "You clicked on the header", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(FoodActivity.this, "You clicked food type in position: " + position, Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(FoodActivity.this, GridViewActivity.class);
                    intent.putExtra("foodName", foodArrayList.get(position-1).getFoodName());
                    intent.putExtra("foodIngredients", foodArrayList.get(position-1).getFoodIngredients());
                    intent.putExtra("foodPrice", foodArrayList.get(position-1).getFoodPrice());
                    startActivity(intent);
                }
            }
        });
        foodListView.setAdapter(foodAdapter);
    }
}