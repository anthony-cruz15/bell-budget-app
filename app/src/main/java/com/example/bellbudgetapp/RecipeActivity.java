package com.example.bellbudgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity implements View.OnClickListener {

    Button fenceButton, drinkingButton, manholeButton, stoneButton, destinationsButton, waveButton, brickButton, simpleButton, stallButton, stoneArchButton, fountainButton, outdoorButton, siloButton, robotButton;
    ArrayList<Item> recipeItems;
    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        loadItems();

        fenceButton = findViewById(R.id.fence_btn);
        drinkingButton = findViewById(R.id.drinking_btn);
        manholeButton = findViewById(R.id.manhole_btn);
        stoneButton = findViewById(R.id.stone_btn);
        destinationsButton = findViewById(R.id.destination_btn);
        waveButton = findViewById(R.id.wave_btn);
        brickButton = findViewById(R.id.brick_btn);
        simpleButton = findViewById(R.id.simple_btn);
        stallButton = findViewById(R.id.stall_btn);
        stoneArchButton = findViewById(R.id.stone_arch_btn);
        fountainButton = findViewById(R.id.fountain_btn);
        outdoorButton = findViewById(R.id.outdoor_btn);
        siloButton = findViewById(R.id.silo_btn);
        robotButton = findViewById(R.id.robot_btn);
        buttons = new Button[] {
                fenceButton, drinkingButton, manholeButton, stoneButton, destinationsButton, waveButton, brickButton, simpleButton, stallButton, stoneArchButton, fountainButton, outdoorButton, siloButton, robotButton
        };
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fence_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[0], ItemDB.recipePrices[0], false));
                break;
            case R.id.drinking_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[1], ItemDB.recipePrices[1], false));
                break;
            case R.id.manhole_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[2], ItemDB.recipePrices[2], false));
                break;
            case R.id.stone_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[3], ItemDB.recipePrices[3], false));
                break;
            case R.id.destination_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[4], ItemDB.recipePrices[4], false));
                break;
            case R.id.wave_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[5], ItemDB.recipePrices[5], false));
                break;
            case R.id.brick_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[6], ItemDB.recipePrices[6], false));
                break;
            case R.id.simple_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[7], ItemDB.recipePrices[7], false));
                break;
            case R.id.stall_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[8], ItemDB.recipePrices[8], false));
                break;
            case R.id.stone_arch_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[9], ItemDB.recipePrices[9], false));
                break;
            case R.id.fountain_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[10], ItemDB.recipePrices[10], false));
                break;
            case R.id.outdoor_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[11], ItemDB.recipePrices[11], false));
                break;
            case R.id.silo_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[12], ItemDB.recipePrices[12], false));
                break;
            case R.id.robot_btn:
                recipeItems.add(new Item(ItemDB.recipeNames[13], ItemDB.recipePrices[13], false));
                break;
        }
        saveItems();
    }

    private void saveItems() {
        SharedPreferences sharedPreferences = this.getSharedPreferences(MainActivity.SHARED_PREF_KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String itemListString = gson.toJson(recipeItems);
        editor.putString(MainActivity.RECIPE_LIST_KEY, itemListString);
        editor.apply();
    }
    private void loadItems() {
        SharedPreferences sharedPreferences = this.getSharedPreferences(MainActivity.SHARED_PREF_KEY, Context.MODE_PRIVATE);
        String recipeItemListString = sharedPreferences.getString(MainActivity.RECIPE_LIST_KEY, null);
        Type type = new TypeToken<ArrayList<Item>>(){}.getType();
        Gson gson = new Gson();
        recipeItems = gson.fromJson(recipeItemListString, type);
        if (recipeItems == null) {
            recipeItems = new ArrayList<>();
        }
    }
}