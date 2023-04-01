package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import com.example.orderservice.model.Return;
import com.example.orderservice.repository.OrderRepository;
import com.example.orderservice.repository.ReturnRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders/return")
public class ReturnController {

    private ReturnRepository returnRepository;
    private OrderRepository orderRepository;

    public ReturnController(ReturnRepository returnRepository, OrderRepository orderRepository) {
        this.returnRepository = returnRepository;
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public List<Return> findAll() {
        return returnRepository.findAll();
    }

    @PutMapping
    public void submitReturn(@RequestBody Return returnRequested) {
        Order order = orderRepository.getById(returnRequested.getOrderId());
        if (order != null) {
            returnRepository.create(returnRequested);
        } else {
            throw new IllegalStateException("order with this id was not found.");
        }

    }

}
