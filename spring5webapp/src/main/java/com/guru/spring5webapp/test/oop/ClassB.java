package com.guru.spring5webapp.test.oop;

public class ClassB extends ClassA{

    public ClassB(){
       super("Ahmed");
        System.out.println(super.getName());
    }

    public static void main(String[] args) {
        ClassB classB = new ClassB();
    }
}
