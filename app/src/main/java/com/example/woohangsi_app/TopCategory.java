package com.example.woohangsi_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class TopCategory extends AppCompatActivity {

    TextView txtCustomer, txtYear, txtMonth, txtTop1, txtTop2, txtTop3, txtCustomer2, nameTop1,
            top1LastCost, top1Recommend, nameTop2, top2LastCost, top2Recommend, nameTop3, top3LastCost,
            top3Recommend;
    ImageView top1, top2, top3, top1_2, top2_2, top3_2;
    Button btnRecommend, btnApply;
    ViewFlipper vFlipper;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_top);

        txtCustomer = (TextView) findViewById(R.id.txtCustomer);
        txtCustomer2 = (TextView) findViewById(R.id.txtCustomer2);
        txtYear = (TextView) findViewById(R.id.txtYear);
        txtMonth = (TextView) findViewById(R.id.txtMonth);
        txtTop1 = (TextView) findViewById(R.id.txtTop1);
        txtTop2 = (TextView) findViewById(R.id.txtTop2);
        txtTop3 = (TextView) findViewById(R.id.txtTop3);
        nameTop1 = (TextView) findViewById(R.id.nameTop1);
        nameTop2 = (TextView) findViewById(R.id.nameTop2);
        nameTop3 = (TextView) findViewById(R.id.nameTop3);
        top1LastCost = (TextView) findViewById(R.id.top1LastCost);
        top2LastCost = (TextView) findViewById(R.id.top2LastCost);
        top3LastCost = (TextView) findViewById(R.id.top3LastCost);
        top1Recommend = (TextView) findViewById(R.id.top1Recommend);
        top2Recommend = (TextView) findViewById(R.id.top2Recommend);
        top3Recommend = (TextView) findViewById(R.id.top3Recommend);

        top1 = (ImageView) findViewById(R.id.top1);
        top2 = (ImageView) findViewById(R.id.top2);
        top3 = (ImageView) findViewById(R.id.top3);
        top1_2 = (ImageView) findViewById(R.id.top1_2);
        top2_2 = (ImageView) findViewById(R.id.top2_2);
        top3_2 = (ImageView) findViewById(R.id.top3_2);

        btnRecommend = (Button) findViewById(R.id.btnRecommend);
        btnApply = (Button) findViewById(R.id.btnApply);

        vFlipper = (ViewFlipper) findViewById(R.id.vFlipper);

        btnRecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });
    }
}
