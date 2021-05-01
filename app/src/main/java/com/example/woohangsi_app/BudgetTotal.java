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

    TextView txtCustomer, txtMonth, Budget_view;
    EditText Budget_write;
    LinearLayout Budget_write_btn, Budget_view_btn;
    Button btnApply, btnCancel, btnEdit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_budget);

        txtCustomer = (TextView)findViewById(R.id.txtCustomer);
        txtMonth = (TextView)findViewById(R.id.txtMonth);
        Budget_view = (TextView)findViewById(R.id.Budget_view);

        Budget_write = (EditText)findViewById(R.id.Budget_write);

        Budget_write_btn = (LinearLayout)findViewById(R.id.Budget_write_btn);
        Budget_view_btn = (LinearLayout)findViewById(R.id.Budget_view_btn);

        btnApply = (Button)findViewById(R.id.btnApply);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        btnEdit = (Button)findViewById(R.id.btnEdit);

        btnApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Budget_view.setText(Budget_write.getText().toString());
                Budget_write.setVisibility(View.GONE);
                Budget_view.setVisibility(View.VISIBLE);
                Budget_write_btn.setVisibility(View.GONE);
                Budget_view_btn.setVisibility(View.VISIBLE);

                Intent intent = new Intent();
                intent.putExtra("total", Budget_view.getText());
                setResult(RESULT_OK, intent);

            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Budget_write.setVisibility(View.VISIBLE);
                Budget_view.setVisibility(View.GONE);
                Budget_write_btn.setVisibility(View.VISIBLE);
                Budget_view_btn.setVisibility(View.GONE);

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
