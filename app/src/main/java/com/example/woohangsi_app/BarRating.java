package com.example.woohangsi_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BarRating extends Fragment {

    TextView txtCustomer, totalBudget, foodBudget, cafeBudget, alcholBudget, lifeBudget, shoppingBudget,
            fashionBudget, beautyBudget, trafficBudget, carBudget, houseBudget, healthBudget, capitalBudget,
            cultureBudget, travelBudget, educateBudget, childrenBudget, petBudget, presentBudget;
    LinearLayout food, cafe, alchol, life, shopping, fashion, beauty, traffic, car, house, health, capital,
                culture, travel, educate, children, pet, present;
    ProgressBar  progressBar_total_budget, progressBar_food, progressBar_cafe, progressBar_alchol, progressBar_life, progressBar_shopping,
            progressBar_fashion, progressBar_beauty, progressBar_traffic, progressBar_car, progressBar_house,
            progressBar_health, progressBar_capital, progressBar_culture, progressBar_travel, progressBar_educate,
            progressBar_children, progressBar_pet, progressBar_present;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rating_bar, container, false);

        txtCustomer = (TextView)view.findViewById(R.id.txtCustomer);
        totalBudget = (TextView)view.findViewById(R.id.totalBudget);
        foodBudget = (TextView)view.findViewById(R.id.foodBudget);
        cafeBudget = (TextView)view.findViewById(R.id.cafeBudget);
        alcholBudget = (TextView)view.findViewById(R.id.alcholBudget);
        lifeBudget = (TextView)view.findViewById(R.id.lifeBudget);
        shoppingBudget = (TextView)view.findViewById(R.id.shoppingBudget);
        fashionBudget = (TextView)view.findViewById(R.id.fashionBudget);
        beautyBudget = (TextView)view.findViewById(R.id.beautyBudget);
        trafficBudget = (TextView)view.findViewById(R.id.trafficBudget);
        carBudget = (TextView)view.findViewById(R.id.carBudget);
        houseBudget = (TextView)view.findViewById(R.id.houseBudget);
        healthBudget = (TextView)view.findViewById(R.id.healthBudget);
        capitalBudget = (TextView)view.findViewById(R.id.capitalBudget);
        cultureBudget = (TextView)view.findViewById(R.id.cultureBudget);
        travelBudget = (TextView)view.findViewById(R.id.travelBudget);
        educateBudget = (TextView)view.findViewById(R.id.educateBudget);
        childrenBudget = (TextView)view.findViewById(R.id.childrenBudget);
        petBudget = (TextView)view.findViewById(R.id.petBudget);
        presentBudget = (TextView)view.findViewById(R.id.presentBudget);

        food = (LinearLayout) view.findViewById(R.id.food);
        cafe = (LinearLayout) view.findViewById(R.id.cafe);
        alchol = (LinearLayout) view.findViewById(R.id.alchol);
        life = (LinearLayout) view.findViewById(R.id.life);
        shopping = (LinearLayout) view.findViewById(R.id.shopping);
        fashion = (LinearLayout) view.findViewById(R.id.fashion);
        beauty = (LinearLayout) view.findViewById(R.id.beauty);
        traffic = (LinearLayout) view.findViewById(R.id.traffic);
        car = (LinearLayout) view.findViewById(R.id.car);
        house = (LinearLayout) view.findViewById(R.id.house);
        health = (LinearLayout) view.findViewById(R.id.health);
        capital = (LinearLayout) view.findViewById(R.id.capital);
        culture = (LinearLayout) view.findViewById(R.id.culture);
        travel = (LinearLayout) view.findViewById(R.id.travel);
        educate = (LinearLayout) view.findViewById(R.id.educate);
        children = (LinearLayout) view.findViewById(R.id.children);
        pet = (LinearLayout) view.findViewById(R.id.pet);
        present = (LinearLayout) view.findViewById(R.id.present);

        progressBar_food = (ProgressBar)view.findViewById(R.id.progressBar_food);
        progressBar_cafe = (ProgressBar)view.findViewById(R.id.progressBar_cafe);
        progressBar_alchol = (ProgressBar)view.findViewById(R.id.progressBar_alchol);
        progressBar_life = (ProgressBar)view.findViewById(R.id.progressBar_life);
        progressBar_shopping = (ProgressBar)view.findViewById(R.id.progressBar_shopping);
        progressBar_fashion = (ProgressBar)view.findViewById(R.id.progressBar_fashion);
        progressBar_beauty = (ProgressBar)view.findViewById(R.id.progressBar_beauty);
        progressBar_traffic = (ProgressBar)view.findViewById(R.id.progressBar_traffic);
        progressBar_car = (ProgressBar)view.findViewById(R.id.progressBar_car);
        progressBar_house = (ProgressBar)view.findViewById(R.id.progressBar_house);
        progressBar_health = (ProgressBar)view.findViewById(R.id.progressBar_health);
        progressBar_capital = (ProgressBar)view.findViewById(R.id.progressBar_capital);
        progressBar_culture = (ProgressBar)view.findViewById(R.id.progressBar_culture);
        progressBar_travel = (ProgressBar)view.findViewById(R.id.progressBar_travel);
        progressBar_educate = (ProgressBar)view.findViewById(R.id.progressBar_educate);
        progressBar_children = (ProgressBar)view.findViewById(R.id.progressBar_children);
        progressBar_pet = (ProgressBar)view.findViewById(R.id.progressBar_pet);
        progressBar_present = (ProgressBar)view.findViewById(R.id.progressBar_present);


        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.rating_bar, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
