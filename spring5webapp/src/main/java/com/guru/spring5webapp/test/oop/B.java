package com.guru.spring5webapp.test.oop;

public class B extends A{
    @Override
    public void run() {
        System.out.println("Hello Man!");
    }

    @Override
    public void display() {
        super.display();
    }
}
