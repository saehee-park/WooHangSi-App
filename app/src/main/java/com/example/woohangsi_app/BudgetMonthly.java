package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetMonthly extends AppCompatActivity {

    TextView txtCustomer, threemonth_budget;
    Button detail_btn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monthly_budget);

        txtCustomer = (TextView)findViewById(R.id.txtCustomer);
        threemonth_budget = (TextView)findViewById(R.id.threemonth_budget);

        detail_btn = (Button) findViewById(R.id.detail_btn);
    }

}
