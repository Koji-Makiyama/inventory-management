package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.Order;
import com.koji.firstproject.inventorymanagement.repositories.OrderRepository;

@Service
public class OrderService {
    
    @Autowired
    OrderRepository orderRepository;
    
        public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Order findWarehouseById(int id) {
        Optional<Order> order = orderRepository.findById(id);

        if(order.isPresent()){
            return order.get();
        } else {
            return null;
        }
    }

}
