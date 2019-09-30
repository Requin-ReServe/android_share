package com.example.reserve;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class StoreAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    public static class StoreViewHolder extends RecyclerView.ViewHolder {
        TextView store_list;
        TextView store_list_location;

        StoreViewHolder(View view){
            super(view);
            store_list = view.findViewById(R.id.store_list);
            store_list_location = view.findViewById(R.id.store_list_location);
        }
    }

    private ArrayList<StoreData> store_data_list;
    StoreAdapter(ArrayList<StoreData> my_data_list){
        this.store_data_list = my_data_list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_my_store_list, parent, false);

        return new StoreViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        StoreViewHolder storeViewHolder = (StoreViewHolder) holder;

        storeViewHolder.store_list.setText(store_data_list.get(position).store_list);
        storeViewHolder.store_list_location.setText(store_data_list.get(position).store_list_location);
    }

    @Override
    public int getItemCount() {
        return store_data_list.size();
    }
}

/*public class StoreAdapter extends RecyclerView.Adapter<StoreAdapter.ViewHolder>{

    public List<StoreData> mainData  = Collections.emptyList();
    private Context context;

    TextView store_list;
    TextView store_list_location;

    public  class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View view) {
            super(view);
            store_list  = (TextView) view.findViewById(R.id.store_list);
            store_list_location  = (TextView)view.findViewById(R.id.store_list_location);
        }
    }
    public StoreAdapter(Context context, List<StoreData> mainData){
        this.mainData = mainData;
        this.context = context;
    }
    @Override
    public StoreAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.store_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public  void onBindViewHolder(ViewHolder holder, int position) {
    holder.
    }

    @Override
    public int getItemCount() {
        return(null != );
    }*/


