package com.example.bookstore.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookstore.ProductDetails;
import com.example.bookstore.R;
import com.example.bookstore.model.DiscountedProducts;
import java.util.List;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedProductViewHolder> {

    Context context;
    List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(Context context, List<DiscountedProducts> discountedProductsList) {
        this.context = context;
        this.discountedProductsList = discountedProductsList;
    }

    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.discounted_row_items, parent, false);
        return new DiscountedProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {

        holder.discountImageView.setImageResource(discountedProductsList.get(position).getImageurl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(context, ProductDetails.class);
                i.putExtra("name",discountedProductsList.get(position).getName());
                i.putExtra("image",discountedProductsList.get(position).getImageurl());
                i.putExtra("price",discountedProductsList.get(position).getPrice());
                i.putExtra("discount",discountedProductsList.get(position).getDiscount());
                i.putExtra("desc",discountedProductsList.get(position).getDescription());
                i.putExtra("qty",discountedProductsList.get(position).getQuantity());
                i.putExtra("unit",discountedProductsList.get(position).getUnit());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return discountedProductsList.size();
    }

    public static class DiscountedProductViewHolder extends  RecyclerView.ViewHolder{

        ImageView discountImageView;

        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);

            discountImageView = itemView.findViewById(R.id.discountImage);

        }
    }
}
