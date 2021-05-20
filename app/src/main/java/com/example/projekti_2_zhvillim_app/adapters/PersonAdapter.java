package com.example.projekti_2_zhvillim_app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.projekti_2_zhvillim_app.R;
import com.example.projekti_2_zhvillim_app.models.Person;

import java.util.ArrayList;

public class PersonAdapter extends BaseAdapter {
    Context context;
    ArrayList<Person> arrayList;
    LayoutInflater inflater;

    public PersonAdapter(Context context, ArrayList<Person> arrayList){
        this.context = context;
        this.arrayList = arrayList;
        inflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return arrayList.size();
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

        view = inflater.inflate(R.layout.profile_cell,null);

        ImageView imageViewProfile = view.findViewById(R.id.ivProfile);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvSurname = view.findViewById(R.id.tvSurname);

        Person person = arrayList.get(position);

        imageViewProfile.setImageResource(person.getProfileImage());
        tvName.setText(person.getName());
        tvSurname.setText(person.getSurname());
        return view;
    }
}
