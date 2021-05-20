package com.example.projekti_2_zhvillim_app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projekti_2_zhvillim_app.R;
import com.example.projekti_2_zhvillim_app.models.Drink;

import java.util.ArrayList;

public class DrinkAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    ArrayList<Drink> drinkArrayList = new ArrayList<>();

    public DrinkAdapter(Context context, ArrayList<Drink> drinkArrayList) {
        this.context = context;
        this.drinkArrayList = drinkArrayList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return drinkArrayList.size();
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
        view = inflater.inflate(R.layout.grid_view_cell,null);

        ImageView drinkImage = view.findViewById(R.id.ivFoto);
        TextView tvDrinkName = view.findViewById(R.id.tvDrinkName);

        Drink drink = drinkArrayList.get(position);

        drinkImage.setImageResource(drink.getDrinkImage());
        tvDrinkName.setText(drink.getDrinkName());


        return view;
    }
}
