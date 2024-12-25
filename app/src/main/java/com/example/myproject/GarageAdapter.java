package com.example.myproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GarageAdapter extends RecyclerView.Adapter<GarageAdapter.ItemViewHolder> {

        private List<GarageMockup> itemList;

        // Constructor
        public GarageAdapter(List<GarageMockup> itemList) {
            this.itemList = itemList;
        }

        @Override
        public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            // Inflate your item layout (create an XML file for individual items)
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.garagemoockup_layout, parent, false);
            return new ItemViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ItemViewHolder holder, int position) {
            GarageMockup item = itemList.get(position);
            holder.txtGarageName.setText(item.getGarageName());
            holder.txtLocation.setText(item.getLocation());
            holder.txtpersonalName.setText(item.getPersonalName());
            holder.imgLogo.setImageResource(item.getLogoImageResource());
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }

        // ViewHolder class
        public static class ItemViewHolder extends RecyclerView.ViewHolder {

            TextView txtGarageName, txtLocation, txtpersonalName;
            ImageView imgLogo;

            public ItemViewHolder(View itemView) {
                super(itemView);
                txtGarageName = itemView.findViewById(R.id.txtCustimorName);
                txtLocation = itemView.findViewById(R.id.txtLocation);
                txtpersonalName = itemView.findViewById(R.id.txtNumber);
                imgLogo = itemView.findViewById(R.id.imgLogo);
            }
        }
    }


