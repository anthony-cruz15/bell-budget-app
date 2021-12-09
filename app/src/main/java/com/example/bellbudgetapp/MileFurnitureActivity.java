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

public class MileFurnitureActivity extends AppCompatActivity implements View.OnClickListener {

    Button constructionButton, lifeguardButton, portableButton, streetlampButton, utilityButton, drinkButton, publicButton, snackButton, springyButton, touristButton, parkButton, sandboxButton, cottonButton, playgroundButton, parabolicButton, soccerButton, solarButton, windButton, lighthouseButton, monsterButton, poolButton, teacupButton;
    public ArrayList<Item> mileFurnitureItems;
    private Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mile_furniture);
        loadItems();

        constructionButton = findViewById(R.id.construction_sign_button);
        lifeguardButton = findViewById(R.id.lifeguard_button);
        portableButton = findViewById(R.id.portable_button);
        streetlampButton = findViewById(R.id.streetlamp_button);
        utilityButton = findViewById(R.id.utility_pole_button);
        drinkButton = findViewById(R.id.drink_button);
        publicButton = findViewById(R.id.public_button);
        snackButton = findViewById(R.id.snack_button);
        springyButton = findViewById(R.id.springy_button);
        touristButton = findViewById(R.id.tourist_button);
        parkButton = findViewById(R.id.park_button);
        sandboxButton = findViewById(R.id.sandbox_button);
        cottonButton = findViewById(R.id.cottoncandy_button);
        playgroundButton = findViewById(R.id.playground_button);
        parabolicButton = findViewById(R.id.parabolic_button);
        soccerButton = findViewById(R.id.soccer_button);
        solarButton = findViewById(R.id.solar_button);
        windButton = findViewById(R.id.wind_button);
        lighthouseButton = findViewById(R.id.lighthouse_button);
        monsterButton = findViewById(R.id.monster_button);
        poolButton = findViewById(R.id.pool_button);
        teacupButton = findViewById(R.id.teacup_button);
        //Assigning OnClickListener
        buttons = new Button[] {
                constructionButton, lifeguardButton, portableButton, streetlampButton, utilityButton, drinkButton, publicButton, snackButton, springyButton, touristButton, parkButton, sandboxButton, cottonButton, playgroundButton, parabolicButton, soccerButton, solarButton, windButton, lighthouseButton, monsterButton, poolButton, teacupButton
        };
        for (Button button : buttons) {
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.construction_sign_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[0], ItemDB.mileFurniturePrices[0], false));
                constructionButton.setClickable(false);
                break;
            case R.id.lifeguard_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[1], ItemDB.mileFurniturePrices[1], false));
                constructionButton.setClickable(false);
                break;
            case R.id.portable_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[2], ItemDB.mileFurniturePrices[2], false));
                constructionButton.setClickable(false);
                break;
            case R.id.streetlamp_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                streetlampButton.setClickable(false);
            case R.id.utility_pole_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[4], ItemDB.mileFurniturePrices[4], false));
                utilityButton.setClickable(false);
            case R.id.drink_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[5], ItemDB.mileFurniturePrices[5], false));
                drinkButton.setClickable(false);
            case R.id.public_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[6], ItemDB.mileFurniturePrices[6], false));
                publicButton.setClickable(false);
            case R.id.snack_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[7], ItemDB.mileFurniturePrices[7], false));
                snackButton.setClickable(false);
            case R.id.springy_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[8], ItemDB.mileFurniturePrices[8], false));
                springyButton.setClickable(false);
            case R.id.tourist_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                touristButton.setClickable(false);
            case R.id.park_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                parkButton.setClickable(false);
            case R.id.sandbox_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                sandboxButton.setClickable(false);
            case R.id.cottoncandy_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                cottonButton.setClickable(false);
            case R.id.playground_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                playgroundButton.setClickable(false);
            case R.id.parabolic_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                parabolicButton.setClickable(false);
            case R.id.soccer_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                soccerButton.setClickable(false);
            case R.id.solar_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                solarButton.setClickable(false);
            case R.id.wind_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                windButton.setClickable(false);
            case R.id.lighthouse_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                lighthouseButton.setClickable(false);
            case R.id.monster_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                monsterButton.setClickable(false);
            case R.id.pool_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                poolButton.setClickable(false);
            case R.id.teacup_button:
                mileFurnitureItems.add(new Item(ItemDB.mileFurnitureNames[3], ItemDB.mileFurniturePrices[3], false));
                teacupButton.setClickable(false);
        }
    }

        private void saveItems () {
            SharedPreferences sharedPreferences = this.getSharedPreferences(MainActivity.SHARED_PREF_KEY, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            Gson gson = new Gson();
            String itemListString = gson.toJson(mileFurnitureItems);
            editor.putString(MainActivity.MILE_FURNITURE_LIST_KEY, itemListString);
            editor.apply();
        }
    private void loadItems() {
        SharedPreferences sharedPreferences = this.getSharedPreferences(MainActivity.SHARED_PREF_KEY, Context.MODE_PRIVATE);
        String mileFurnitureItemListString = sharedPreferences.getString(MainActivity.MILE_FURNITURE_LIST_KEY, null);
        Type type = new TypeToken<ArrayList<Item>>(){}.getType();
        Gson gson = new Gson();
        mileFurnitureItems = gson.fromJson(mileFurnitureItemListString, type);
        if (mileFurnitureItems == null) {
            mileFurnitureItems = new ArrayList<>();
        }
    }
}