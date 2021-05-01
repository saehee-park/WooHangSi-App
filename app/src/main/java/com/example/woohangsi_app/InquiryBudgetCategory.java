package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InquiryBudgetCategory extends AppCompatActivity {

    LinearLayout food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital,
            culture, travel, educate, children, pet, present;

    TextView foodLastCost, foodBudget, cafeLastCost, cafeBudget, alcholLastCost, alcholBudget,
            lifeLastCost, lifeBudget, shoppingLastCost, shoppingBudget, fashionLastCost, fashionBudget,
            beautyLastCost, beautyBudget, trafficLastCost, trafficBudget, carLastCost, carBudget,
            houseLastCost, houseBudget, healthLastCost, healthBudget, capitalLastCost, capitalBudget,
            cultureLastCost, cultureBudget, travelLastCost, travelBudget, educateLastCost, educateBudget,
            childrenLastCost, childrenBudget, petLastCost, petBudget, presentLastCost, presentBudget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_budget_inquiry);

        food = (LinearLayout) findViewById(R.id.food);
        cafe = (LinearLayout) findViewById(R.id.cafe);
        alchol = (LinearLayout) findViewById(R.id.alchol);
        life = (LinearLayout) findViewById(R.id.life);
        shopping = (LinearLayout) findViewById(R.id.shopping);
        fashion = (LinearLayout) findViewById(R.id.fashion);
        beauty = (LinearLayout) findViewById(R.id.beauty);
        traffic = (LinearLayout) findViewById(R.id.traffic);
        car = (LinearLayout) findViewById(R.id.car);
        house = (LinearLayout) findViewById(R.id.house);
        health = (LinearLayout) findViewById(R.id.health);
        capital = (LinearLayout) findViewById(R.id.capital);
        culture = (LinearLayout) findViewById(R.id.culture);
        travel = (LinearLayout) findViewById(R.id.travel);
        educate = (LinearLayout) findViewById(R.id.educate);
        children = (LinearLayout) findViewById(R.id.children);
        pet = (LinearLayout) findViewById(R.id.pet);
        present = (LinearLayout) findViewById(R.id.present);

        foodLastCost = (TextView) findViewById(R.id.foodLastCost);
        foodBudget = (TextView) findViewById(R.id.foodBudget);
        cafeLastCost = (TextView) findViewById(R.id.cafeLastCost);
        cafeBudget = (TextView) findViewById(R.id.cafeBudget);
        alcholLastCost = (TextView) findViewById(R.id.alcholLastCost);
        alcholBudget = (TextView) findViewById(R.id.alcholBudget);
        lifeLastCost = (TextView) findViewById(R.id.lifeLastCost);
        lifeBudget = (TextView) findViewById(R.id.lifeBudget);
        shoppingLastCost = (TextView) findViewById(R.id.shoppingLastCost);
        shoppingBudget = (TextView) findViewById(R.id.shoppingBudget);
        fashionLastCost = (TextView) findViewById(R.id.fashionLastCost);
        fashionBudget = (TextView) findViewById(R.id.fashionBudget);
        beautyLastCost = (TextView) findViewById(R.id.beautyLastCost);
        beautyBudget = (TextView) findViewById(R.id.beautyBudget);
        trafficLastCost = (TextView) findViewById(R.id.trafficLastCost);
        trafficBudget = (TextView) findViewById(R.id.trafficBudget);
        carLastCost = (TextView) findViewById(R.id.carLastCost);
        carBudget = (TextView) findViewById(R.id.carBudget);
        houseLastCost = (TextView) findViewById(R.id.houseLastCost);
        houseBudget = (TextView) findViewById(R.id.houseBudget);
        healthLastCost = (TextView) findViewById(R.id.healthLastCost);
        healthBudget = (TextView) findViewById(R.id.healthBudget);
        capitalLastCost = (TextView) findViewById(R.id.capitalLastCost);
        capitalBudget = (TextView) findViewById(R.id.capitalBudget);
        cultureLastCost = (TextView) findViewById(R.id.cultureLastCost);
        cultureBudget = (TextView) findViewById(R.id.cultureBudget);
        travelLastCost = (TextView) findViewById(R.id.travelLastCost);
        travelBudget = (TextView) findViewById(R.id.travelBudget);
        educateLastCost = (TextView) findViewById(R.id.educateLastCost);
        educateBudget = (TextView) findViewById(R.id.educateBudget);
        childrenLastCost = (TextView) findViewById(R.id.childrenLastCost);
        childrenBudget = (TextView) findViewById(R.id.childrenBudget);
        petLastCost = (TextView) findViewById(R.id.petLastCost);
        petBudget = (TextView) findViewById(R.id.petBudget);
        presentLastCost = (TextView) findViewById(R.id.presentLastCost);
        presentBudget = (TextView) findViewById(R.id.presentBudget);

    }
}
