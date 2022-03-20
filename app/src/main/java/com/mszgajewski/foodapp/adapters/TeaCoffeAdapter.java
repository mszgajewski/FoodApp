package com.mszgajewski.foodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;
import com.mszgajewski.foodapp.R;
import com.mszgajewski.foodapp.models.AllRestaurantModels;
import com.mszgajewski.foodapp.models.TeaCoffeModels;

import java.util.List;

public class TeaCoffeAdapter extends RecyclerView.Adapter<TeaCoffeAdapter.ViewHolder> {

    List<TeaCoffeModels> list;

    public TeaCoffeAdapter(List<TeaCoffeModels> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.tea_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.roundedImageView.setImageResource(list.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        RoundedImageView roundedImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            roundedImageView = itemView.findViewById(R.id.roundedImageView3);
        }
    }
}
