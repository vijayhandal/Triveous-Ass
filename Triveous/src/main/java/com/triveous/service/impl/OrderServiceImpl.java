package com.triveous.service.impl;

import com.triveous.model.Order;
import com.triveous.repository.OrderRepository;
import com.triveous.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void placeOrder() {
        // Implement logic to place an order
    }

    @Override
    public List<Order> getOrderHistory() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

}
