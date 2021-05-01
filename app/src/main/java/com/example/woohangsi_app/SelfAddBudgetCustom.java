package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SelfAddBudgetCustom extends AppCompatActivity {

    ImageView brand_self_img;
    EditText brand_self_name, brand_self_budget;
    Button btnApply, btnCancel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_budget_add_self);

        brand_self_img = (ImageView) findViewById(R.id.brand_self_img);
        brand_self_name = (EditText) findViewById(R.id.brand_self_name);
        brand_self_budget = (EditText) findViewById(R.id.brand_self_budget);
        btnApply = (Button) findViewById(R.id.btnApply);
        btnCancel = (Button) findViewById(R.id.btnCancel);

    }
}
