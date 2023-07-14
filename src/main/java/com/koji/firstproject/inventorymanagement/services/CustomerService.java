package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.Customer;
import com.koji.firstproject.inventorymanagement.repositories.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository customerRepository;
 
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if(customer.isPresent()){
            return customer.get();
        } else {
            return null;
        }
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
