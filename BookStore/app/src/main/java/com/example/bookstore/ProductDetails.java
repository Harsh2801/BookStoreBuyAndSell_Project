package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    ImageView img, back;
    TextView bookName, bookPrice, bookDesc, bookQty, bookUnit,bookDiscount;

    String name, price, desc, qty, unit,dis;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", R.drawable.book1);
        price = i.getStringExtra("price");
        desc = i.getStringExtra("desc");
        qty = i.getStringExtra("qty");
        unit = i.getStringExtra("unit");
        dis = i.getStringExtra("discount");

        bookName = findViewById(R.id.bokName);
        bookDesc = findViewById(R.id.bokDesc);
        bookPrice = findViewById(R.id.bokPrice);
        img = findViewById(R.id.big_image);
        back = findViewById(R.id.back);
        bookQty = findViewById(R.id.qty);
        bookUnit = findViewById(R.id.unit);
        bookDiscount = findViewById(R.id.discount);

        bookName.setText(name);
        bookPrice.setText(price);
        bookDesc.setText(desc);
        bookQty.setText(qty);
        bookUnit.setText(unit);
        bookDiscount.setText(dis);


        img.setImageResource(image);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ProductDetails.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });
    }
}