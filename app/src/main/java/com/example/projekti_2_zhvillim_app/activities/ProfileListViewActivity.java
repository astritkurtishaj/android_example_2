package com.example.projekti_2_zhvillim_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.projekti_2_zhvillim_app.R;
import com.example.projekti_2_zhvillim_app.adapters.PersonAdapter;
import com.example.projekti_2_zhvillim_app.models.Person;

import java.util.ArrayList;

public class ProfileListViewActivity extends AppCompatActivity {

    ListView profileListView;
    ArrayList<Person> arrayList = new ArrayList<>();
    PersonAdapter personAdapter;
    Button randomNrGen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_list_view);

        randomNrGen = findViewById(R.id.btnRandomNr);

        profileListView = findViewById(R.id.profileListView);
        arrayList.add(new Person(R.mipmap.profile,"Astrit","Kurtishaj"));
        arrayList.add(new Person(R.mipmap.profile,"Rea","Spahiu"));
        arrayList.add(new Person(R.mipmap.profile,"Melina","Hajdini"));
        arrayList.add(new Person(R.mipmap.profile,"Ardit","Hoti"));
        arrayList.add(new Person(R.mipmap.profile,"Egzon","Zylfiaj"));

        personAdapter = new PersonAdapter(this,arrayList);
        profileListView.setAdapter(personAdapter);

        randomNrGen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNr = (int) (Math.random()*100);

                Toast.makeText(ProfileListViewActivity.this, "The random nr is "+randomNr, Toast.LENGTH_LONG).show();
            }
        });

    }
}