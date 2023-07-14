package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.CustomerOrderPart;
import com.koji.firstproject.inventorymanagement.repositories.CustomerOrderPartRepository;

@Service
public class CustomerOrderPartService {

    @Autowired
    CustomerOrderPartRepository customerOrderPartRepository;

    public List<CustomerOrderPart> findAllCustomerOrderParts() {
        return customerOrderPartRepository.findAll();
    }

    public CustomerOrderPart findCustomerOrderPartById(int id) {
        Optional<CustomerOrderPart> part = customerOrderPartRepository.findById(id);

        if (part.isPresent()) {
            return part.get();
        } else {
            return null;
        }
    }

    public CustomerOrderPart saveCustomerOrderPart(CustomerOrderPart customerOrderPart) {
        return customerOrderPartRepository.save(customerOrderPart);
    }

}
