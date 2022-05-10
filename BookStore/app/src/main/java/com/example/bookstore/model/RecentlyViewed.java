package com.example.bookstore.model;

import android.graphics.drawable.Drawable;

public class RecentlyViewed {

    String name;
    String description;
    String price;
    String quantity;
    String unit;
    int imageUrl;
    Integer id;

    public RecentlyViewed(String name, String description, String price, String quantity, String unit, int imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.imageUrl = imageUrl;
    }

    //-----------------------------------
    public RecentlyViewed(Integer id, int imageurl) {
        this.id = id;
        this.imageUrl = imageurl;
    }
    //----------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getImageUrl() {

        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {

        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
