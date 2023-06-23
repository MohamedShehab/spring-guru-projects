package com.guru.spring5webapp.solid.principles;

public class Product1 extends Product {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getProductOffer() {
        return 10;
    }
}
