package com.guru.spring5webapp.abstractfactory;

public class FactoryCreator {
    public AbstractFactory getFactory(String choose) {
        if (choose.equals("land")) {
            return new LandTransportationFactory();
        } else if (choose.equals("air")) {
            return new AirTransportationFactory();
        }
        return null;
    }
}
