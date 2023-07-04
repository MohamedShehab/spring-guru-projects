package com.guru.spring5webapp.test.oop;

public class PassByReferenceB {

    public void display(PassByReferenceA passByReferenceA) {
        passByReferenceA.number++;
    }

    public static void main(String[] args) {
        PassByReferenceB passByReferenceB = new PassByReferenceB();
        PassByReferenceA passByReferenceA = new PassByReferenceA();
        passByReferenceA.number = 10;
        passByReferenceB.display(passByReferenceA);
        System.out.println(passByReferenceA.number);
    }
}
