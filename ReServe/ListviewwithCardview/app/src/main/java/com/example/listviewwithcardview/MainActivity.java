package com.example.listviewwithcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView store_list;
    StoreAdapter storeAdapter;
    ArrayList<String> store_data =  new ArrayList<>();
    ArrayList<String> store_location = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        store_list= findViewById(R.id.store_list);
        storeAdapter = new StoreAdapter();

        store_data.add("할리스 커피");
        store_location.add("대전 유성구 어쩌구");

        store_list.setAdapter(storeAdapter);

    }

    class StoreAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return store_data.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item,null);
            TextView store_list = v.findViewById(R.id.store_list);
            TextView store_list_location = v.findViewById(R.id.store_list_location);

            store_list.setText(store_data.get(position));
            store_list_location.setText(store_data.get(position));

            return v;
        }
    }
}