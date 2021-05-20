package com.example.projekti_2_zhvillim_app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projekti_2_zhvillim_app.R;
import com.example.projekti_2_zhvillim_app.models.Food;

import java.util.ArrayList;

public class FoodAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<Food> foodArrayList = new ArrayList<>();


    public FoodAdapter(Context context, ArrayList<Food> foodArrayList) {
        this.context = context;
        this.foodArrayList = foodArrayList;
        inflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return foodArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = inflater.inflate(R.layout.food_cell,null);
        ImageView foodImage = view.findViewById(R.id.ivFood);
        TextView tvFoodName = view.findViewById(R.id.tvFoodType);
        TextView tvFoodIngredients = view.findViewById(R.id.tvFoodIngredients);
        TextView tvPrice = view.findViewById(R.id.tvFoodPrice);

        Food food = foodArrayList.get(position);

        foodImage.setImageResource(food.getFoodImage());
        tvFoodName.setText(food.getFoodName());
        tvFoodIngredients.setText(food.getFoodIngredients());
        tvPrice.setText(food.getFoodPrice());

        return view;
    }
}
