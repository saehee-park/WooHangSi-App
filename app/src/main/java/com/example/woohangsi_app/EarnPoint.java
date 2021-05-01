package com.example.woohangsi_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EarnPoint extends AppCompatActivity {

    TextView txtCustomer, point, Inquiry_point, Inquiry_year, Inquiry_month, Inquiry_day;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_earn);

        txtCustomer = (TextView)findViewById(R.id.txtCustomer);
        point = (TextView)findViewById(R.id.point);
        Inquiry_point = (TextView)findViewById(R.id.Inquiry_point);
        Inquiry_year = (TextView)findViewById(R.id.Inquiry_year);
        Inquiry_month = (TextView)findViewById(R.id.Inquiry_month);
        Inquiry_day = (TextView)findViewById(R.id.Inquiry_day);
    }
}
