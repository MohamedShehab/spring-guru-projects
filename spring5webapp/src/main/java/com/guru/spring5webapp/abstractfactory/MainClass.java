package com.guru.spring5webapp.abstractfactory;

public class MainClass {
    public static void main(String[] args) {
        FactoryCreator factoryCreator = new FactoryCreator();
        AbstractFactory abstractFactory = factoryCreator.getFactory("land");
        LandTransportation transportation = abstractFactory.getLandTransportation("miniBus");
        System.out.println(transportation.getPrice());
    }
}
