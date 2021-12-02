package com.example.bellbudgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class ConstructionActivity extends AppCompatActivity implements View.OnClickListener {

    Button logButton, suspensionButton, woodenButton, stoneButton, brickButton, zenButton, redZenButton, ironButton;
    public ArrayList<Item> constructionItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction);
        constructionItems = new ArrayList<Item>();

        logButton = findViewById(R.id.log_button);
        suspensionButton = findViewById(R.id.suspension_button);
        woodenButton = findViewById(R.id.wooden_button);

        logButton.setOnClickListener(this);
        suspensionButton.setOnClickListener(this);
        woodenButton.setOnClickListener(this);
    };

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.log_button:
                constructionItems.add(new Item(ItemDB.constructionNames[0], ItemDB.constructionPrices[0] ));
                logButton.setClickable(false);
                break;
            case R.id.suspension_button:
                constructionItems.add(new Item(ItemDB.constructionNames[1], ItemDB.constructionPrices[1]));
                break;
            case R.id.wooden_button:
                constructionItems.add(new Item(ItemDB.constructionNames[2], ItemDB.constructionPrices[2]));
                break;
        }
    }
}

