package com.triveous.service;

import com.triveous.model.Order;

import java.util.List;

public interface OrderService {
    void placeOrder();

    List<Order> getOrderHistory();

    Order getOrderById(Long orderId);

}
