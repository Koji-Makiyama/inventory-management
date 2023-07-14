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
import com.koji.firstproject.inventorymanagement.models.CustomerOrder;
import com.koji.firstproject.inventorymanagement.services.CustomerOrderService;
import com.koji.firstproject.inventorymanagement.services.CustomerService;

@RestController
@RequestMapping("/customer-orders")
@CrossOrigin("*")
public class CustomerOrderController {

    @Autowired
    CustomerOrderService customerOrderService;

    @GetMapping
    public ResponseEntity<List<CustomerOrder>> findAllCustomerOrders() {
        List<CustomerOrder> customerOrders = customerOrderService.findAllCustomerOrders();
        return new ResponseEntity<List<CustomerOrder>>(customerOrders, HttpStatus.OK);
    }

    @PostMapping("/customer-order")
    public ResponseEntity<CustomerOrder> createCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        CustomerOrder newCustomerOrder = customerOrderService.saveCustomerOrder(customerOrder);
        return new ResponseEntity<CustomerOrder>(newCustomerOrder, HttpStatus.CREATED);
    }

    @PutMapping("/customer-order/put")
    public ResponseEntity<CustomerOrder> updateCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        CustomerOrder newCustomerOrder = customerOrderService.saveCustomerOrder(customerOrder);
        return new ResponseEntity<CustomerOrder>(newCustomerOrder, HttpStatus.OK);
    }

    @DeleteMapping("/customer/delete")
    public ResponseEntity<CustomerOrder> deleteCustomerOrder(@RequestBody CustomerOrder customerOrder) {
        CustomerOrder newCustomerOrder = customerOrderService.saveCustomerOrder(customerOrder);
        return new ResponseEntity<CustomerOrder>(newCustomerOrder, HttpStatus.OK);
    }

}
