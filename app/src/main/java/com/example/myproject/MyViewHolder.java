package com.example.myproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public  class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView INServiceIMageView;
    TextView inServiceUserTV;
    TextView InServiceNumberTV;
    TextView InServiceModelTV;
    TextView INServeiceStatusTV;
    TextView InServicePriceTV;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        INServiceIMageView=itemView.findViewById(R.id.INServiceIMageView);
        inServiceUserTV=itemView.findViewById(R.id.inServiceUserTV);
        InServiceNumberTV=itemView.findViewById(R.id.InServiceNumberTV);
        InServiceModelTV=itemView.findViewById(R.id.InServiceModelTV);
        INServeiceStatusTV=itemView.findViewById(R.id.INServeiceStatusTV);
        InServicePriceTV=itemView.findViewById(R.id.InServicePriceTV);
    }
}
