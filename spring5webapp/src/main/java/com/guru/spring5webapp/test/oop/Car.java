package com.guru.spring5webapp.test.oop;

public interface Car {

    public static final String name = null;
    public default void display(){
        System.out.println("Hello everyone!!");
    }

    public static void run(){
        System.out.println("Test");
    }

    public String run1();
}
