package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetCheck extends AppCompatActivity {

    ViewFlipper vFlipper;
    TextView txtCustomer, goal_budget, pay_budget;
    EditText Budget;
    Button detail_btn, getPoint_btn, back_btn;
    View divider;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_budget);

        vFlipper = (ViewFlipper) findViewById(R.id.vFlipper);

        txtCustomer = (TextView) findViewById(R.id.txtCustomer);
        goal_budget = (TextView) findViewById(R.id.goal_budget);
        pay_budget = (TextView) findViewById(R.id.pay_budget);

        Budget = (EditText)findViewById(R.id.Budget);

        detail_btn = (Button) findViewById(R.id.detail_btn);
        getPoint_btn = (Button) findViewById(R.id.getPoint_btn);
        back_btn = (Button) findViewById(R.id.back_btn);

        divider = (View) findViewById(R.id.divider);

        getPoint_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EarnPoint.class);
                startActivity(intent);
            }
        });

        detail_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious();
            }
        });
    }
}
