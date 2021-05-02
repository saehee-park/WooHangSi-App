package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        detail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SpendThreeMonth.class);
                startActivity(intent);
            }
        });

    }

}
