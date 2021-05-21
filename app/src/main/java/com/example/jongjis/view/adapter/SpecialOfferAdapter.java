package com.example.jongjis.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jongjis.R;
import com.example.jongjis.model.PopModel;

import java.util.ArrayList;

public class SpecialOfferAdapter extends RecyclerView.Adapter<SpecialOfferAdapter.ViewHolder>{
    ArrayList<PopModel> popModels = new ArrayList<>();
    Context context;

    public void setPopModels( ArrayList<PopModel> popModels){
        this.popModels = popModels;
        notifyDataSetChanged();
    }

    public SpecialOfferAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public SpecialOfferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_list_versoin2,parent,false);
        return new SpecialOfferAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialOfferAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(popModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return popModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.itemImage);
        }
    }
}
