package com.example.bookstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bookstore.adapter.CategoryAdapter;
import com.example.bookstore.adapter.DiscountedProductAdapter;
import com.example.bookstore.adapter.RecentlyViewedAdapter;
import com.example.bookstore.model.Category;
import com.example.bookstore.model.DiscountedProducts;
import com.example.bookstore.model.RecentlyViewed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView discountRecyclerView, categoryRecyclerView, recentlyViewedRecycler;
    DiscountedProductAdapter discountedProductAdapter;
    List<DiscountedProducts> discountedProductsList;

    CategoryAdapter categoryAdapter;
    List<Category> categoryList;

    RecentlyViewedAdapter recentlyViewedAdapter;
    List<RecentlyViewed> recentlyViewedList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        recentlyViewedRecycler = findViewById(R.id.recently_items);

        //adding data to discounted model
        discountedProductsList = new ArrayList<>();
//        discountedProductsList.add(new DiscountedProducts(1,R.drawable.discountceo));
//        discountedProductsList.add(new DiscountedProducts(2,R.drawable.discountdigital));
//        discountedProductsList.add(new DiscountedProducts(3,R.drawable.discountjosh));
//        discountedProductsList.add(new DiscountedProducts(4,R.drawable.discountceo));
//        discountedProductsList.add(new DiscountedProducts(5,R.drawable.discountdigital));
//        discountedProductsList.add(new DiscountedProducts(6,R.drawable.discountjosh));
        discountedProductsList.add(new DiscountedProducts("The Whole-Brain Child", "12 Revolutionary Strategies to Nurture Your Child's Developing Mind.", "₹ 130","40% Discount", "11", "Book Left",R.drawable.discount1));
        discountedProductsList.add(new DiscountedProducts("Never Split the Difference", "Negotiating As If Your Life Depended On It.", "₹ 150","30% Discount", "20", "Book Left",R.drawable.discount5));
        discountedProductsList.add(new DiscountedProducts("The Miracle Morning", "The Not-So-Obvious Secret Guaranteed to Transform Your Life.", "₹ 180","25% Discount", "15", "Book Left",R.drawable.discount3));
        discountedProductsList.add(new DiscountedProducts("The Purpose-Driven Life", "What on Earth Am I Here For?.", "₹ 190","35% Discount", "31", "Book Left",R.drawable.discount2));
        discountedProductsList.add(new DiscountedProducts("100 Ways to Motivate Yourself", "Change Your Life Forever.", "₹ 150","20% Discount", "34", "Book Left",R.drawable.discount4));
        discountedProductsList.add(new DiscountedProducts("When the Moon Split", "A biography of Prophet Muhammad.", "₹ 190","25% Discount", "40", "Book Left",R.drawable.discount7));


        //adding data to category model
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1,R.drawable.biography));
        categoryList.add(new Category(2,R.drawable.adventure));
        categoryList.add(new Category(3,R.drawable.fantasy));
        categoryList.add(new Category(4,R.drawable.sifi));
        categoryList.add(new Category(5,R.drawable.children));
        categoryList.add(new Category(6,R.drawable.detective));

        //adding data to recently model
        recentlyViewedList = new ArrayList<>();
//        recentlyViewedList.add(new RecentlyViewed(1,R.drawable.book1));
//        recentlyViewedList.add(new RecentlyViewed(1,R.drawable.book2));
//        recentlyViewedList.add(new RecentlyViewed(1,R.drawable.book3));
//        recentlyViewedList.add(new RecentlyViewed(1,R.drawable.book4));
        recentlyViewedList.add(new RecentlyViewed("The Gifts of Imperfection", " Let Go of Who You Think You're Supposed to Be and Embrace Who You Are.", "₹ 80", "10", "Book Left",R.drawable.book1));
        recentlyViewedList.add(new RecentlyViewed("Boundaries", "When to Say Yes, How to Say No to Take Control of Your Life.", "₹ 95", "27", "Book Left",R.drawable.book2));
        recentlyViewedList.add(new RecentlyViewed("Start Where You Are", "A Guide to Compassionate Living.", "₹ 70", "16", "Book Left",R.drawable.book3));
        recentlyViewedList.add(new RecentlyViewed("The 5 Second Rule", "Transform your Life, Work, and Confidence with Everyday Courage.", "₹ 50", "5", "Book Left",R.drawable.book4));



        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
        setRecentlyViewedRecycler(recentlyViewedList);


    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this, categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }

    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this, recentlyViewedDataList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }
}