package com.example.woohangsi_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FixedSpend extends Fragment {

    TextView txtCustomer, txtMonth, spend_name, spend_money;
    ImageView spend_img;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.spend_fixed, container, false);

        txtCustomer = (TextView)view.findViewById(R.id.txtCustomer);
        txtMonth = (TextView)view.findViewById(R.id.txtMonth);
        spend_name = (TextView)view.findViewById(R.id.spend_name);
        spend_money = (TextView)view.findViewById(R.id.spend_money);

        spend_img = (ImageView)view.findViewById(R.id.spend_img);

        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.spend_fixed, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
