package com.example.bellbudgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ConstructionActivity extends AppCompatActivity {

    Button logButton, suspensionButton, woodenButton, stoneButton, brickButton, zenButton, redZenButton, ironButton;
    public ArrayList<Item> constructionItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction);
    }

    public void addConstructionItem(View view) {
        //TODO make method work
    }
}