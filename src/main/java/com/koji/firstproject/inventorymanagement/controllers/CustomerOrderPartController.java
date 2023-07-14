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

import com.koji.firstproject.inventorymanagement.models.CustomerOrderPart;
import com.koji.firstproject.inventorymanagement.services.CustomerOrderPartService;

@RestController
@RequestMapping("/customer-order-parts")
@CrossOrigin("*")
public class CustomerOrderPartController {

    @Autowired
    CustomerOrderPartService customerOrderPartService;

    @GetMapping
    public ResponseEntity<List<CustomerOrderPart>> findAllCustomerOrderParts() {
        List<CustomerOrderPart> customerOrderParts = customerOrderPartService.findAllCustomerOrderParts();
        return new ResponseEntity<List<CustomerOrderPart>>(customerOrderParts, HttpStatus.OK);
    }

    @PostMapping("/customer-order-part")
    public ResponseEntity<CustomerOrderPart> createCustomer(@RequestBody CustomerOrderPart customerOrderPart) {
        CustomerOrderPart newCustomerOrderPart = customerOrderPartService.saveCustomerOrderPart(customerOrderPart);
        return new ResponseEntity<CustomerOrderPart>(newCustomerOrderPart, HttpStatus.CREATED);
    }

    @PutMapping("/customer-order-part/put")
    public ResponseEntity<CustomerOrderPart> updateCustomer(@RequestBody CustomerOrderPart customerOrderPart) {
        CustomerOrderPart newCustomerOrderPart = customerOrderPartService.saveCustomerOrderPart(customerOrderPart);
        return new ResponseEntity<CustomerOrderPart>(newCustomerOrderPart, HttpStatus.OK);
    }

    @DeleteMapping("/customer-order-part/delete")
    public ResponseEntity<CustomerOrderPart> deleteCustomer(@RequestBody CustomerOrderPart customerOrderPart) {
        CustomerOrderPart newCustomerOrderPart = customerOrderPartService.saveCustomerOrderPart(customerOrderPart);
        return new ResponseEntity<CustomerOrderPart>(newCustomerOrderPart, HttpStatus.OK);
    }

}
