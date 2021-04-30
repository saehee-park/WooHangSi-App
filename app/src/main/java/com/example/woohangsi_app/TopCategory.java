package com.example.woohangsi_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class TopCategory extends AppCompatActivity {

    Button btnBuget;
    ViewFlipper vFlipper;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_top);

//        btnBuget = (Button) findViewById(R.id.btnBuget);
        vFlipper = (ViewFlipper) findViewById(R.id.vFlipper);

        btnBuget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });
    }
}
