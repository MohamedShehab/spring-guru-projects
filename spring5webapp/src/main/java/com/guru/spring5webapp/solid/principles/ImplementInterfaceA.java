package com.guru.spring5webapp.solid.principles;

public class ImplementInterfaceA implements InterfaceA{
    @Override
    public String sayHello() {
        return "Good Morning!";
    }

    public static void main(String[] args) {
        InterfaceA interfaceA = new ImplementInterfaceA();
        System.out.println(interfaceA.getSalary());
    }
}
