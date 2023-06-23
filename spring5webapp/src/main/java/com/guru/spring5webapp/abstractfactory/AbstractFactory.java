package com.guru.spring5webapp.abstractfactory;


public abstract class AbstractFactory {
   abstract LandTransportation getLandTransportation(String landType);
   abstract AirTransportation getAirTransportation(String airType);

}
