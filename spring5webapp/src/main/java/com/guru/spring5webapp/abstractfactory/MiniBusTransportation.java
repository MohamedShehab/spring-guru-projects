package com.guru.spring5webapp.abstractfactory;

public class MiniBusTransportation extends LandTransportation{
    @Override
    int getPrice() {
        return 1000;
    }

    @Override
    int getDuration() {
        return 20;
    }
}
