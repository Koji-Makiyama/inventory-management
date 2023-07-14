package com.koji.firstproject.inventorymanagement.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.koji.firstproject.inventorymanagement.models.Customer;
import com.koji.firstproject.inventorymanagement.services.CustomerService;

@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomers() {
        List<Customer> customers = customerService.findAllCustomers();
        return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<Customer>(newCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/customer/put")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<Customer>(newCustomer, HttpStatus.OK);
    }

    @DeleteMapping("/customer/delete")
    public ResponseEntity<Customer> deleteCustomer(@RequestBody Customer customer) {
        Customer newCustomer = customerService.saveCustomer(customer);
        return new ResponseEntity<Customer>(newCustomer, HttpStatus.OK);
    }

}
