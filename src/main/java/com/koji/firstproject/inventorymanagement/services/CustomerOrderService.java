package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.CustomerOrder;
import com.koji.firstproject.inventorymanagement.repositories.CustomerOrderRepository;

@Service
public class CustomerOrderService {
    
    @Autowired
    CustomerOrderRepository customerOrderRepository;
    
        public List<CustomerOrder> findAllOrders() {
        return customerOrderRepository.findAll();
    }

    public CustomerOrder findWarehouseById(int id) {
        Optional<CustomerOrder> order = customerOrderRepository.findById(id);

        if(order.isPresent()){
            return order.get();
        } else {
            return null;
        }
    }

}
