package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SpendThreeMonth extends AppCompatActivity {

    TextView txtCustomer, txtMonth1, txtMonth2, txtMonth3, Month1_money, Month2_money, Month3_money;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_month_spend);

        txtCustomer = (TextView) findViewById(R.id.txtCustomer);
        txtMonth1 = (TextView) findViewById(R.id.txtMonth1);
        txtMonth2 = (TextView) findViewById(R.id.txtMonth2);
        txtMonth3 = (TextView) findViewById(R.id.txtMonth3);
        Month1_money = (TextView)findViewById(R.id.Month1_money);
        Month2_money = (TextView)findViewById(R.id.Month2_money);
        Month3_money = (TextView)findViewById(R.id.Month3_money);
    }
}
