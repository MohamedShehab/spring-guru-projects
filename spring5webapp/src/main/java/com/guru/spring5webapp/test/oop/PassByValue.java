package com.guru.spring5webapp.test.oop;

public class PassByValue {

    public void display(int x){
        ++x;
        System.out.println(x);
    }

    public static void main(String[] args) {
        PassByValue passByValue = new PassByValue();
        int y = 100;
        passByValue.display(y);
        System.out.println(y);
    }
}
