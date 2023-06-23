package com.guru.spring5webapp.abstractfactory;

public class AirTransportationFactory extends AbstractFactory {
    @Override
    LandTransportation getLandTransportation(String landType) {
        if (landType.equals("lorry")) {
            return new LorryTransportation();
        } else if (landType.equals("miniBus")) {
            return new MiniBusTransportation();
        }
        return null;
    }

    @Override
    AirTransportation getAirTransportation(String airType) {
        return null;
    }
}
