package com.example.bellbudgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.util.ArrayList;

public class ConstructionActivity extends AppCompatActivity implements View.OnClickListener {

    Button logButton, suspensionButton, woodenButton, stoneButton, brickButton, zenButton, redZenButton, ironButton;
    public ArrayList<Item> constructionItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction);
        constructionItems = new ArrayList<Item>();
        //Bridge Button Bindings
        logButton = findViewById(R.id.log_button);
        suspensionButton = findViewById(R.id.suspension_button);
        woodenButton = findViewById(R.id.wooden_button);
        stoneButton = findViewById(R.id.stone_button);
        brickButton = findViewById(R.id.brick_button);
        zenButton = findViewById(R.id.zen_button);
        redZenButton = findViewById(R.id.redZen_button);
        ironButton = findViewById(R.id.iron_button);
        //Bridge Button OnClickListeners
        logButton.setOnClickListener(this);
        suspensionButton.setOnClickListener(this);
        woodenButton.setOnClickListener(this);
        stoneButton.setOnClickListener(this);
        brickButton.setOnClickListener(this);
        zenButton.setOnClickListener(this);
        redZenButton.setOnClickListener(this);
        ironButton.setOnClickListener(this);
    };

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.log_button:
                constructionItems.add(new Item(ItemDB.constructionNames[0], ItemDB.constructionPrices[0], true ));
                logButton.setClickable(false);
                break;
            case R.id.suspension_button:
                constructionItems.add(new Item(ItemDB.constructionNames[1], ItemDB.constructionPrices[1], true));
                break;
            case R.id.wooden_button:
                constructionItems.add(new Item(ItemDB.constructionNames[2], ItemDB.constructionPrices[2], true));
                break;
            case R.id.stone_button:
                constructionItems.add(new Item(ItemDB.constructionNames[3], ItemDB.constructionPrices[3], true));
                break;
            case R.id.brick_button:
                constructionItems.add(new Item(ItemDB.constructionNames[4], ItemDB.constructionPrices[4], true));
                break;
            case R.id.zen_button:
                constructionItems.add(new Item(ItemDB.constructionNames[5], ItemDB.constructionPrices[5], true));
                break;
            case R.id.redZen_button:
                constructionItems.add(new Item(ItemDB.constructionNames[6], ItemDB.constructionPrices[6], true));
                break;
            case R.id.iron_button:
                constructionItems.add(new Item(ItemDB.constructionNames[7], ItemDB.constructionPrices[7], true));
                break;
        }
        saveItems();
    }

    private void saveItems() {
        SharedPreferences sharedPreferences = this.getSharedPreferences(MainActivity.SHARED_PREF_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String itemListString = gson.toJson(constructionItems);
        editor.putString(MainActivity.CONSTRUCTION_LIST_KEY, itemListString);
        editor.apply();
    }
}

