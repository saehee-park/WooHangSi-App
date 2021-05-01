package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetSelectCategory extends AppCompatActivity {

    LinearLayout food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital,
            culture, travel, educate, children, pet, present;

    CheckBox foodBudget, cafeBudget, alcholBudget, lifeBudget, shoppingBudget, fashionBudget, beautyBudget,
            trafficBudget, carBudget, houseBudget, healthBudget, capitalBudget, cultureBudget, travelBudget,
            educateBudget, childrenBudget, petBudget, presentBudget;

    Button btnAdd;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_budget_select);

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

        foodBudget = (CheckBox) findViewById(R.id.foodBudget);
        cafeBudget = (CheckBox) findViewById(R.id.cafeBudget);
        alcholBudget = (CheckBox) findViewById(R.id.alcholBudget);
        lifeBudget = (CheckBox) findViewById(R.id.lifeBudget);
        shoppingBudget = (CheckBox) findViewById(R.id.shoppingBudget);
        fashionBudget = (CheckBox) findViewById(R.id.fashionBudget);
        beautyBudget = (CheckBox) findViewById(R.id.beautyBudget);
        trafficBudget = (CheckBox) findViewById(R.id.trafficBudget);
        carBudget = (CheckBox) findViewById(R.id.carBudget);
        houseBudget = (CheckBox) findViewById(R.id.houseBudget);
        healthBudget = (CheckBox) findViewById(R.id.healthBudget);
        capitalBudget = (CheckBox) findViewById(R.id.capitalBudget);
        cultureBudget = (CheckBox) findViewById(R.id.cultureBudget);
        travelBudget = (CheckBox) findViewById(R.id.travelBudget);
        educateBudget = (CheckBox) findViewById(R.id.educateBudget);
        childrenBudget = (CheckBox) findViewById(R.id.childrenBudget);
        petBudget = (CheckBox) findViewById(R.id.petBudget);
        presentBudget = (CheckBox) findViewById(R.id.presentBudget);

        btnAdd = (Button) findViewById(R.id.btnAdd);

    }
}
