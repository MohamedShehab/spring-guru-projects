package com.guru.spring5webapp.designpatterns.creational.factory;

public interface Transportation {

    public abstract int getPrice();
    public abstract int getTax();
    public abstract int getDuration();
}
