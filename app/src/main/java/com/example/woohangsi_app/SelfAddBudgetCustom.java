package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.woohangsi_app.DB.Brand;

public class SelfAddBudgetCustom extends AppCompatActivity {
EditText brand_self_name, brand_self_budget;
Button btnApply, btnCancel;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_budget_add_self);
        btnApply = (Button) findViewById(R.id.btnApply);

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("total", brand_self_name.getText());
                setResult(RESULT_OK, intent);
            }
        });
    }
}
