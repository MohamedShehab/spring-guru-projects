package com.guru.spring5webapp.designpatterns.creational.factory;

public class TestOrder {

    public static void main(String[] args) {

        Order order = new Order("Pen" , 500);
        Order order1 = order.clone();
        System.out.println(order1.getOrderName());
        System.out.println(order.equals(order1));

        DBManager dbManager = DBManager.getInstance("123456");
        System.out.println(dbManager.ip);
        DBManager dbManager1 = DBManager.getInstance("789789");
        System.out.println(dbManager1.ip);
    }
}
