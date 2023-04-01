package com.example.orderservice.repository;

import com.example.orderservice.model.Order;
import com.example.orderservice.model.Return;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReturnRepository {

    List<Return> returns = new ArrayList<>();

    public List<Return> findAll() {
        return returns;
    }

    public void create(Return returnRequested) {
        returns.add(returnRequested);
    }

}
