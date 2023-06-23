package com.guru.spring5webapp.abstractfactory;

public class LorryTransportation extends LandTransportation{
    @Override
    int getPrice() {
        return 500;
    }

    @Override
    int getDuration() {
        return 10;
    }
}
