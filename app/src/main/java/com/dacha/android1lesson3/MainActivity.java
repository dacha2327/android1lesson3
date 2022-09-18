 package com.dacha.android1lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
    private ArrayList<String> carsList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_num);
        carsList.add("Mark2");
        carsList.add("Chaiser");
        carsList.add("BMW E36");
        carsList.add("SilviaS15");
        carsList.add("SilviaS14");
        carsList.add("Toyota Supra");
        carsList.add("GT86");
        carsList.add("Toyota AE86");
        carsList.add("Skylaine r34");
        carsList.add("Mazda rx7");
        CarsAdapter countAdapter = new CarsAdapter(carsList);
        recyclerView.setAdapter(countAdapter);
    }
}