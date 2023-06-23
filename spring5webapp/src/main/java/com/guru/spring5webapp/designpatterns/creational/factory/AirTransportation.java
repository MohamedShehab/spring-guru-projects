package com.guru.spring5webapp.designpatterns.creational.factory;

public class AirTransportation implements Transportation{
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public int getTax() {
        return 20;
    }

    @Override
    public int getDuration() {
        return 30;
    }
}
