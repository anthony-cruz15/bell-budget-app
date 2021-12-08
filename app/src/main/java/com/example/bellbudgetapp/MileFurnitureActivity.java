package com.example.bellbudgetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MileFurnitureActivity extends AppCompatActivity implements View.OnClickListener {

    Button constructionButton, lifeguardButton, portableButton, streetlampButton, utilityButton, drinkButton, publicButton, snackButton, springyButton, touristButton, parkButton, sandboxButton, cottonButton, playgroundButton, parabolicButton, soccerButton, solarButton, windButton, lighthouseButton, monsterButton, poolButton, teacupButton;
    public ArrayList<Item> mileFurnitureItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mile_furniture);
        mileFurnitureItems = new ArrayList<Item>();

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

        constructionButton.setOnClickListener(this);
        lifeguardButton.setOnClickListener(this);
        portableButton.setOnClickListener(this);
        streetlampButton.setOnClickListener(this);
        utilityButton.setOnClickListener(this);
        drinkButton.setOnClickListener(this);
        publicButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }
}