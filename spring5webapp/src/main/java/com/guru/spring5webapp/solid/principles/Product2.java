package com.guru.spring5webapp.solid.principles;

public class Product2 extends Product{

    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getProductOffer() {
        return 15;
    }
}
