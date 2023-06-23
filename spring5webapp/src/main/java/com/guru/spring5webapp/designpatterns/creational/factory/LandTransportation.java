package com.guru.spring5webapp.designpatterns.creational.factory;

public class LandTransportation implements Transportation{
    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public int getTax() {
        return 50;
    }

    @Override
    public int getDuration() {
        return 60;
    }
}
