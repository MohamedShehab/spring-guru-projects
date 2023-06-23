package com.example.springwebapp.test;

import java.util.Base64;

public class JavaApiFeatures {
    public static void main(String[] args) {

        String name = "Mohamed Ahmed";
        String encodedData = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(encodedData);
        System.out.println(Base64.getDecoder().decode(encodedData).length);
    }
}
