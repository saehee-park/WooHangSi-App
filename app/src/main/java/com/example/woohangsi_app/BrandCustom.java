package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BrandCustom extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU=101;
    ViewFlipper vFlipper;

    ImageView starbucks_img, twosome_img, ediya_img, gongcha_img, backdabang_img, sulbing_img, pascucci_img, polbaset_img, baskin_img, tomtom_img, self1_img, self2_img,
            self3_img, self4_img, self5_img, self6_img, self7_img;
    TextView self1, self2;
    Button nextBtn, prevBtn;
    int i;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_brand);

        vFlipper = (ViewFlipper) findViewById(R.id.vFlipper);

        starbucks_img = (ImageView) findViewById(R.id.starbucks_img);
        twosome_img = (ImageView) findViewById(R.id.twosome_img);
        ediya_img = (ImageView) findViewById(R.id.ediya_img);
        gongcha_img = (ImageView) findViewById(R.id.gongcha_img);
        backdabang_img = (ImageView) findViewById(R.id.backdabang_img);
        sulbing_img = (ImageView) findViewById(R.id.sulbing_img);
        pascucci_img = (ImageView) findViewById(R.id.pascucci_img);
        polbaset_img = (ImageView) findViewById(R.id.polbaset_img);
        baskin_img = (ImageView) findViewById(R.id.baskin_img);
        tomtom_img = (ImageView) findViewById(R.id.tomtom_img);
        self1_img = (ImageView) findViewById(R.id.self1_img);
        self2_img = (ImageView) findViewById(R.id.self2_img);
        self3_img = (ImageView) findViewById(R.id.self3_img);
        self4_img = (ImageView) findViewById(R.id.self4_img);
        self5_img = (ImageView) findViewById(R.id.self5_img);
        self6_img = (ImageView) findViewById(R.id.self6_img);
        self7_img = (ImageView) findViewById(R.id.self7_img);

        self1 = (TextView) findViewById(R.id.self1);
        self2 = (TextView) findViewById(R.id.self2);


        ImageView[] brand_img = {starbucks_img, twosome_img, ediya_img, gongcha_img, backdabang_img, sulbing_img, pascucci_img, polbaset_img, baskin_img, tomtom_img};
        ImageView[] self_img = {self1_img, self2_img, self3_img, self4_img, self5_img, self6_img, self7_img};

        for (i = 0; i < brand_img.length; i++) {
            final int index;
            index = i;

            brand_img[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(view.getContext(), AddBudgetCustom.class);
                    startActivity(intent);
                }
            });
        }

        for (i = 0; i < self_img.length; i++) {
            final int index;
            index = i;

            self_img[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), SelfAddBudgetCustom.class);
                        startActivityForResult(intent, REQUEST_CODE_MENU);
                }
            });

        }
        nextBtn = (Button) findViewById(R.id.nextBtn);
        prevBtn = (Button) findViewById(R.id.prevBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });
        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showPrevious();
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_MENU) {
            if (resultCode == RESULT_OK) {
                String total = data.getStringExtra("total");
                self2.setText(total);
            }
        }

    }
}
