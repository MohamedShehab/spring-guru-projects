package com.guru.spring5webapp.solid.principles;

public interface InterfaceA {

    public String sayHello();

    public default int getSalary(){
        return 1500;
    }
}
