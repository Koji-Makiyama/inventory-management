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

import com.koji.firstproject.inventorymanagement.models.Inventory;
import com.koji.firstproject.inventorymanagement.services.InventoryService;

@RestController
@RequestMapping("/inventories")
@CrossOrigin("*")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @GetMapping
    public ResponseEntity<List<Inventory>> findAllInventories() {
        List<Inventory> inventories = inventoryService.findAllInventories();
        return new ResponseEntity<List<Inventory>>(inventories, HttpStatus.OK);
    }

    @PostMapping("/inventory")
    public ResponseEntity<Inventory> createCustomerOrder(@RequestBody Inventory customerOrder) {
        Inventory newInventoryPart = inventoryService.saveInventory(customerOrder);
        return new ResponseEntity<Inventory>(newInventoryPart, HttpStatus.CREATED);
    }

    @PutMapping("/inventory/put")
    public ResponseEntity<Inventory> updateCustomerOrder(@RequestBody Inventory customerOrder) {
        Inventory newCustomerOrder = inventoryService.saveInventory(customerOrder);
        return new ResponseEntity<Inventory>(newCustomerOrder, HttpStatus.OK);
    }

    @DeleteMapping("/inventory/delete")
    public ResponseEntity<Inventory> deleteCustomerOrder(@RequestBody Inventory customerOrder) {
        Inventory newInventoryPart = inventoryService.saveInventory(customerOrder);
        return new ResponseEntity<Inventory>(newInventoryPart, HttpStatus.OK);
    }

}
