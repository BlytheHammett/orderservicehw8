package com.example.orderservice.repository;

import com.example.orderservice.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    List<Order> orders = new ArrayList<>();

    public List<Order> findAll() {
        return orders;
    }

    public int create(Order order) {
        int id = orders.size() + 1;
        order.setCustomerId(id);
        orders.add(order);
        return id;
    }

    public void update(Order order, int customerId) {

    }

    public Order getById(int customerId) {
        Order order = orders.stream().filter(x -> x.getCustomerId() == customerId).findAny().orElse(null);
        return order;
    }

    public void delete(int customerId) {
        Order order = getById(customerId);
        if (order != null) {
            orders.remove(order);
        }
        else {
            throw new IllegalStateException("order with this id was not found.");
        }
    }

}
