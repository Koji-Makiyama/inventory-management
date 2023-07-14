package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.koji.firstproject.inventorymanagement.models.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    
}
