package com.example.reserve;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class my_store_list extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_store_list);

        recyclerView = findViewById(R.id.store_recycler_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<StoreData> my_data_list = new ArrayList<>();
        my_data_list.add(new StoreData("할리스 커피","대전 유성구 어쩌구"));
        StoreAdapter mainAdapter = new StoreAdapter(my_data_list);

        recyclerView.setAdapter(mainAdapter);
    }
}
