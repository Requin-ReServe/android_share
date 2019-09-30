package com.example.reserve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Payment_reservation extends AppCompatActivity {

    RecyclerView payment_recyclerView;
    RecyclerView.LayoutManager payment_layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_reservation);

        payment_recyclerView = findViewById(R.id.menu_list);
        payment_layoutManager = new LinearLayoutManager(this);
        payment_recyclerView.setLayoutManager(payment_layoutManager);

        ArrayList<payment_reservation_Data> payment_data_list = new ArrayList<>();
        payment_data_list.add(new payment_reservation_Data("아메리카노 "," 2500"));
        payment_reservation_Adapter payment_reservation_adapter = new payment_reservation_Adapter(payment_data_list);

        payment_recyclerView.setAdapter(payment_reservation_adapter);
    }
}
