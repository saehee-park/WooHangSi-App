package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetCategory extends AppCompatActivity {

    TextView txtCustomer, txtMonth, Budget, leftBudget, foodLastCost, cafeLastCost, alcholLastCost,
            lifeLastCost, shoppingLastCost, fashionLastCost, beautyLastCost, trafficLastCost, carLastCost,
            houseLastCost, healthLastCost, capitalLastCost, cultureLastCost, travelLastCost, educateLastCost,
            childrenLastCost, petLastCost, presentLastCost;
    Button btnSelect;
    LinearLayout food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital,
            culture, travel, educate, children, pet, present;
    EditText foodBudget, cafeBudget, alcholBudget, lifeBudget, shoppingBudget, fashionBudget, beautyBudget,
            trafficBudget, carBudget, houseBudget, healthBudget, capitalBudget, cultureBudget, travelBudget,
            educateBudget, childrenBudget, petBudget, presentBudget;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_budget);

        txtCustomer = (TextView) findViewById(R.id.txtCustomer);
        txtMonth = (TextView) findViewById(R.id.txtMonth);
        Budget = (TextView) findViewById(R.id.Budget);
        leftBudget = (TextView) findViewById(R.id.leftBudget);
        foodLastCost = (TextView) findViewById(R.id.foodLastCost);
        cafeLastCost = (TextView) findViewById(R.id.cafeLastCost);
        alcholLastCost = (TextView) findViewById(R.id.alcholLastCost);
        lifeLastCost = (TextView) findViewById(R.id.lifeLastCost);
        shoppingLastCost = (TextView) findViewById(R.id.shoppingLastCost);
        fashionLastCost = (TextView) findViewById(R.id.fashionLastCost);
        beautyLastCost = (TextView) findViewById(R.id.beautyLastCost);
        trafficLastCost = (TextView) findViewById(R.id.trafficLastCost);
        carLastCost = (TextView) findViewById(R.id.carLastCost);
        houseLastCost = (TextView) findViewById(R.id.houseLastCost);
        healthLastCost = (TextView) findViewById(R.id.healthLastCost);
        capitalLastCost = (TextView) findViewById(R.id.capitalLastCost);
        cultureLastCost = (TextView) findViewById(R.id.cultureLastCost);
        travelLastCost = (TextView) findViewById(R.id.travelLastCost);
        educateLastCost = (TextView) findViewById(R.id.educateLastCost);
        childrenLastCost = (TextView) findViewById(R.id.childrenLastCost);
        petLastCost = (TextView) findViewById(R.id.petLastCost);
        presentLastCost = (TextView) findViewById(R.id.presentLastCost);

        btnSelect = (Button) findViewById(R.id.btnSelect);

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

        foodBudget = (EditText) findViewById(R.id.foodBudget);
        cafeBudget = (EditText) findViewById(R.id.cafeBudget);
        alcholBudget = (EditText) findViewById(R.id.alcholBudget);
        lifeBudget = (EditText) findViewById(R.id.lifeBudget);
        shoppingBudget = (EditText) findViewById(R.id.shoppingBudget);
        fashionBudget = (EditText) findViewById(R.id.fashionBudget);
        beautyBudget = (EditText) findViewById(R.id.beautyBudget);
        trafficBudget = (EditText) findViewById(R.id.trafficBudget);
        carBudget = (EditText) findViewById(R.id.carBudget);
        houseBudget = (EditText) findViewById(R.id.houseBudget);
        healthBudget = (EditText) findViewById(R.id.healthBudget);
        capitalBudget = (EditText) findViewById(R.id.capitalBudget);
        cultureBudget = (EditText) findViewById(R.id.cultureBudget);
        travelBudget = (EditText) findViewById(R.id.travelBudget);
        educateBudget = (EditText) findViewById(R.id.educateBudget);
        childrenBudget = (EditText) findViewById(R.id.childrenBudget);
        petBudget = (EditText) findViewById(R.id.petBudget);
        presentBudget = (EditText) findViewById(R.id.presentBudget);

    }
}
