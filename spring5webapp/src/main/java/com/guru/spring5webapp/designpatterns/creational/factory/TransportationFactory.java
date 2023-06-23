package com.guru.spring5webapp.designpatterns.creational.factory;

public class TransportationFactory {

    public Transportation getTransportation(String transType) {
        if (transType.equals("air")) {
            return new AirTransportation();
        } else if (transType.equals("lan")) {
            return new LandTransportation();
        }else {
            return null;
        }
    }
}
