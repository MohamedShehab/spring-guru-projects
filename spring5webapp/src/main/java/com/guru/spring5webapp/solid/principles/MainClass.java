package com.guru.spring5webapp.solid.principles;

public class MainClass {
    public static void main(String[] args) {

        Product2 product2 = new Product2();
        int offer = CheckProduct.getProductOffers(product2);
        System.out.println("offer " + offer);
    }
}
