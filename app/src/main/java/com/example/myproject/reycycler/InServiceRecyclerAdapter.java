package com.example.myproject.reycycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myproject.MyViewHolder;
import com.example.myproject.R;

public class InServiceRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;

    public InServiceRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate layout (giving looks to our rows)
        LayoutInflater inflater=LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.car_recycler_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //asign values to the views in the card view layout based on the recycler postion

    }

    @Override
    public int getItemCount() {
        //number of items to display
        return 0;
    }

}
