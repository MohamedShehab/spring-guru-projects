package com.guru.spring5webapp.designpatterns.creational.factory;

import org.aspectj.weaver.ast.Or;

public class Order {
    private String orderName;
    private int price;

    public Order(String orderName, int price) {
        this.orderName = orderName;
        this.price = price;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Order(Order order) {
        this.orderName = order.orderName;
        this.price = order.price;
    }

    public Order clone(){
        return new Order(this);
    }
}
