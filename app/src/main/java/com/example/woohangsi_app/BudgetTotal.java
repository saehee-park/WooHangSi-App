package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BudgetTotal extends AppCompatActivity {

    TextView txtCustomer, txtMonth, txtSetting;
    EditText Budget_write;
    LinearLayout Budget_write_btn;
    Button btnApply, btnCancel, btnBack;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_budget);

        txtCustomer = (TextView)findViewById(R.id.txtCustomer);
        txtMonth = (TextView)findViewById(R.id.txtMonth);

        Budget_write = (EditText)findViewById(R.id.Budget_write);

        btnApply = (Button)findViewById(R.id.btnApply);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        btnBack = (Button)findViewById(R.id.btnBack);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BudgetTotal.super.onBackPressed();
            }
        });

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Budget_write.setText(Budget_write.getText().toString());
                Intent intent = new Intent();
                intent.putExtra("total", Budget_write.getText().toString());
                setResult(RESULT_OK, intent);
            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Budget_write.getText().clear();
            }
        });
    }

}
