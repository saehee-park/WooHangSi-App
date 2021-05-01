package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddBudgetCustom extends AppCompatActivity {

    ImageView brand_img;
    TextView brand_name;
    EditText brand_budget;
    Button btnApply, btnCancel;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_budget_add);

        brand_img = (ImageView) findViewById(R.id.brand_img);
        brand_name = (TextView) findViewById(R.id.brand_name);
        brand_budget = (EditText) findViewById(R.id.brand_budget);
        btnApply = (Button) findViewById(R.id.btnApply);
        btnCancel = (Button) findViewById(R.id.btnCancel);
    }
}
