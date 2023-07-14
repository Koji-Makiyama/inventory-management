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

    public List<CustomerOrder> findAllCustomerOrders() {
        return customerOrderRepository.findAll();
    }

    public CustomerOrder findCustomerOrderById(int id) {
        Optional<CustomerOrder> order = customerOrderRepository.findById(id);

        if (order.isPresent()) {
            return order.get();
        } else {
            return null;
        }
    }

    public CustomerOrder saveCustomerOrder(CustomerOrder customerOrder) {
        return customerOrderRepository.save(customerOrder);
    }

}
