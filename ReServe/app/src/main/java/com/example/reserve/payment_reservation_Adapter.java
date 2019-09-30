package com.example.reserve;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class payment_reservation_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static class payment_reservation_ViewHolder extends RecyclerView.ViewHolder {
        TextView menu_item;
        TextView menu_item_price;

        payment_reservation_ViewHolder(View view){
            super(view);
            menu_item = view.findViewById(R.id.menu_item);
            menu_item_price = view.findViewById(R.id.menu_item_price);
        }
    }

    private ArrayList<payment_reservation_Data> payment_data_list;
    payment_reservation_Adapter(ArrayList<payment_reservation_Data> payment_reservation_data){this.payment_data_list = payment_reservation_data;}

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_payment_reservation, parent, false);
        return new payment_reservation_ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        payment_reservation_ViewHolder payment_reservation_viewHolder = (payment_reservation_ViewHolder) holder;


        payment_reservation_viewHolder.menu_item.setText(payment_data_list.get(position).menu_item);
        payment_reservation_viewHolder.menu_item_price.setText(payment_data_list.get(position).menu_item_price);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
