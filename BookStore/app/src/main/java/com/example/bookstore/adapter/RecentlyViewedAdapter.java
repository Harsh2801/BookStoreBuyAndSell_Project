package com.example.bookstore.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookstore.ProductDetails;
import com.example.bookstore.R;
import com.example.bookstore.model.RecentlyViewed;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.RecentlyViewedViewHolder> {

    Context context;
    List<RecentlyViewed> recentlyViewedList;

    public RecentlyViewedAdapter(Context context, List<RecentlyViewed> recentlyViewedList) {
        this.context = context;
        this.recentlyViewedList = recentlyViewedList;
    }

    @NonNull
    @NotNull
    @Override
    public RecentlyViewedViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recently_viewed_items, parent, false);
        return new RecentlyViewedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecentlyViewedAdapter.RecentlyViewedViewHolder holder, int position) {

//        holder.name.setText(recentlyViewedList.get(position).getName());
//        holder.description.setText(recentlyViewedList.get(position).getDescription());
//        holder.price.setText(recentlyViewedList.get(position).getPrice());
//        holder.qty.setText(recentlyViewedList.get(position).getQuantity());
//        holder.unit.setText(recentlyViewedList.get(position).getUnit());
//        holder.bg.setBackgroundResource(recentlyViewedList.get(position).getImageUrl());
        holder.recentlyImageView.setImageResource(recentlyViewedList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, ProductDetails.class);
                i.putExtra("name",recentlyViewedList.get(position).getName());
                i.putExtra("image",recentlyViewedList.get(position).getImageUrl());
                i.putExtra("price",recentlyViewedList.get(position).getPrice());
                i.putExtra("desc",recentlyViewedList.get(position).getDescription());
                i.putExtra("qty",recentlyViewedList.get(position).getQuantity());
                i.putExtra("unit",recentlyViewedList.get(position).getUnit());
                context.startActivity(i);


            }
        });

    }

    @Override
    public int getItemCount() {

        return recentlyViewedList.size();
    }

    public  static  class RecentlyViewedViewHolder extends  RecyclerView.ViewHolder{

        TextView name, description, price, qty, unit;
        ConstraintLayout bg;
        ImageView recentlyImageView;

        public RecentlyViewedViewHolder(@NonNull @NotNull View itemView) {

            super(itemView);

//            name = itemView.findViewById(R.id.);
//            description = itemView.findViewById(R.id.);
//            price = itemView.findViewById(R.id.);
//            qty = itemView.findViewById(R.id.);
//            unit = itemView.findViewById(R.id.);
              recentlyImageView = itemView.findViewById(R.id.recentlyImage);
        }
    }


}
