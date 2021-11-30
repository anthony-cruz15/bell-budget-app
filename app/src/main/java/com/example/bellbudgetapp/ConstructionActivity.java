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
        constructionItems = new ArrayList<Item>();

        logButton = findViewById(R.id.log_button);
    }

    public void addLogBridge(View view) {
        constructionItems.add(new Item(ItemDB.constructionNames[0], ItemDB.constructionPrices[0]));
        logButton.setClickable(false);
    }
    public void addSuspensionBridge(View v) {
        constructionItems.add(new Item(ItemDB.constructionNames[1], ItemDB.constructionPrices[1]));
    }
    public void addWoodenBridge(View v) {
        constructionItems.add(new Item(ItemDB.constructionNames[2], ItemDB.constructionPrices[2]));
    }
}