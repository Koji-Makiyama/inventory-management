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

import com.koji.firstproject.inventorymanagement.models.CustomerOrder;
import com.koji.firstproject.inventorymanagement.models.InventoryPart;
import com.koji.firstproject.inventorymanagement.services.CustomerOrderService;
import com.koji.firstproject.inventorymanagement.services.InventoryPartService;

@RestController
@RequestMapping("/inventory-parts")
@CrossOrigin("*")
public class InventoryPartController {

    @Autowired
    InventoryPartService customerOrderService;

    @GetMapping
    public ResponseEntity<List<InventoryPart>> findAllInventoryParts() {
        List<InventoryPart> inventoryParts = customerOrderService.findAllInventoryParts();
        return new ResponseEntity<List<InventoryPart>>(inventoryParts, HttpStatus.OK);
    }

    @PostMapping("/inventory-part")
    public ResponseEntity<InventoryPart> createCustomerOrder(@RequestBody InventoryPart customerOrder) {
        InventoryPart newInventoryPart = customerOrderService.saveInventoryPart(customerOrder);
        return new ResponseEntity<InventoryPart>(newInventoryPart, HttpStatus.CREATED);
    }

    @PutMapping("/inventory-part/put")
    public ResponseEntity<InventoryPart> updateCustomerOrder(@RequestBody InventoryPart customerOrder) {
        InventoryPart newCustomerOrder = customerOrderService.saveInventoryPart(customerOrder);
        return new ResponseEntity<InventoryPart>(newCustomerOrder, HttpStatus.OK);
    }

    @DeleteMapping("/inventory-part/delete")
    public ResponseEntity<InventoryPart> deleteCustomerOrder(@RequestBody InventoryPart customerOrder) {
        InventoryPart newInventoryPart = customerOrderService.saveInventoryPart(customerOrder);
        return new ResponseEntity<InventoryPart>(newInventoryPart, HttpStatus.OK);
    }

}
