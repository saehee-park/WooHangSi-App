package com.example.woohangsi_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class InquiryBudgetTotal extends AppCompatActivity {

    TextView txtCustomer, txtMonth, Budget_view;
    LinearLayout Budget_view_btn;
    Button btnEdit, btnBack;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_budget_inquiry);

        txtCustomer = (TextView)findViewById(R.id.txtCustomer);
        txtMonth = (TextView)findViewById(R.id.txtMonth);
        Budget_view = (TextView) findViewById(R.id.Budget_view);

        btnEdit = (Button)findViewById(R.id.btnEdit);
        btnBack = (Button)findViewById(R.id.btnBack);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InquiryBudgetTotal.super.onBackPressed();
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BudgetTotal.class);
                startActivity(intent);
            }
        });

    }


}
