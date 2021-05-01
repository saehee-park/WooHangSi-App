package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InquiryBudgetCustom extends AppCompatActivity {

    ImageView brand_img1;
    TextView brand_name1, brand_Lastbudget1, brand_budget1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_budget_inquiry);

        brand_img1 = (ImageView) findViewById(R.id.brand_img1);
        brand_name1 = (TextView) findViewById(R.id.brand_name1);
        brand_Lastbudget1 = (TextView) findViewById(R.id.brand_Lastbudget1);
        brand_budget1 = (TextView) findViewById(R.id.brand_budget1);
    }
}
