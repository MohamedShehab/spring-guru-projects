package com.guru.spring5webapp.designpatterns.creational.factory;

public class MainApp {
    public static void main(String[] args) {
        TransportationFactory transportationFactory  = new TransportationFactory();
        Transportation transportation = transportationFactory.getTransportation("air");
        System.out.println(transportation.getPrice());
    }
}
