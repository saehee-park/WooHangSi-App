package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryCustom extends AppCompatActivity {

    ViewFlipper vFlipper;
    ImageView food_img, cafe_img, alchol_img, life_img, shopping_img, fashion_img, beauty_img, traffic_img,
            car_img, house_img, health_img, capital_img, culture_img, travel_img, educate_img, children_img,
            pet_img, present_img;
    TextView food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital,
            culture, travel, educate, children, pet, present;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_category);

        vFlipper = (ViewFlipper)findViewById(R.id.vFlipper);

        food_img = (ImageView)findViewById(R.id.food_img);
        cafe_img = (ImageView)findViewById(R.id.cafe_img);
        alchol_img = (ImageView)findViewById(R.id.alchol_img);
        life_img = (ImageView)findViewById(R.id.life_img);
        shopping_img = (ImageView)findViewById(R.id.shopping_img);
        fashion_img = (ImageView)findViewById(R.id.fashion_img);
        beauty_img = (ImageView)findViewById(R.id.beauty_img);
        traffic_img = (ImageView)findViewById(R.id.traffic_img);
        car_img = (ImageView)findViewById(R.id.car_img);
        house_img = (ImageView)findViewById(R.id.house_img);
        health_img = (ImageView)findViewById(R.id.health_img);
        capital_img = (ImageView)findViewById(R.id.capital_img);
        culture_img = (ImageView)findViewById(R.id.culture_img);
        travel_img = (ImageView)findViewById(R.id.travel_img);
        educate_img = (ImageView)findViewById(R.id.educate_img);
        children_img = (ImageView)findViewById(R.id.children_img);
        pet_img = (ImageView)findViewById(R.id.pet_img);
        present_img = (ImageView)findViewById(R.id.present_img);

        food = (TextView)findViewById(R.id.food);
        cafe = (TextView)findViewById(R.id.cafe);
        alchol = (TextView)findViewById(R.id.alchol);
        life = (TextView)findViewById(R.id.life);
        shopping = (TextView)findViewById(R.id.shopping);
        fashion = (TextView)findViewById(R.id.fashion);
        beauty = (TextView)findViewById(R.id.beauty);
        traffic = (TextView)findViewById(R.id.traffic);
        car = (TextView)findViewById(R.id.car);
        house = (TextView)findViewById(R.id.house);
        health = (TextView)findViewById(R.id.health);
        capital = (TextView)findViewById(R.id.capital);
        culture = (TextView)findViewById(R.id.culture);
        travel = (TextView)findViewById(R.id.travel);
        educate = (TextView)findViewById(R.id.educate);
        children = (TextView)findViewById(R.id.children);
        pet = (TextView)findViewById(R.id.pet);
        present = (TextView)findViewById(R.id.present);

        cafe_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BrandCustom.class);
                startActivity(intent);
            }
        });

    }

}
