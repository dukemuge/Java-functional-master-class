package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }


    public Customer addOrder(Order order) {
        orders.add(order);
        return this;
    }


}
