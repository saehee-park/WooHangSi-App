package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SelfAddBudgetCustom extends AppCompatActivity {
    EditText brand_self_name, brand_self_budget;
    Button btnApply, btnCancel, btnBack;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_budget_add_self);

        btnApply = (Button) findViewById(R.id.btnApply);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        brand_self_name = (EditText)findViewById(R.id.brand_self_name);
        brand_self_budget = (EditText)findViewById(R.id.brand_self_budget);

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.putExtra("name", brand_self_name.getText().toString());
                setResult(RESULT_OK, intent);
            }

        });

    }
}
