package com.summahto.java8.features;

import java.util.List;

public class Customer {

    private List<Orders> ordersList;

    public Customer(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return "com.summahto.java8.features.Customer{" +
                "ordersList=" + ordersList +
                '}';
    }
}
