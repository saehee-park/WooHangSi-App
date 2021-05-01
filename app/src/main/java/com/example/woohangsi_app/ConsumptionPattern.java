package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConsumptionPattern extends AppCompatActivity {

    TextView txtCustomer, pattern_name, pattern_cycle, inquiry_pattern_year, inquiry_pattern_month,
            inquiry_pattern_day, inquiry_pattern_store, inquiry_pattern_money;

    ImageView pattern_img, inquiry_pattern_img;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pattern_consumption);

        txtCustomer = (TextView)findViewById(R.id.txtCustomer);
        pattern_name = (TextView)findViewById(R.id.pattern_name);
        pattern_cycle = (TextView)findViewById(R.id.pattern_cycle);
        inquiry_pattern_year = (TextView)findViewById(R.id.inquiry_pattern_year);
        inquiry_pattern_month = (TextView)findViewById(R.id.inquiry_pattern_month);
        inquiry_pattern_day = (TextView)findViewById(R.id.inquiry_pattern_day);
        inquiry_pattern_store = (TextView)findViewById(R.id.inquiry_pattern_store);
        inquiry_pattern_money = (TextView)findViewById(R.id.inquiry_pattern_money);

        pattern_img = (ImageView)findViewById(R.id.pattern_img);
        inquiry_pattern_img = (ImageView)findViewById(R.id.inquiry_pattern_img);

    }
}
