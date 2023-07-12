package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koji.firstproject.inventorymanagement.models.InventoryPart;

public interface InventoryPartRepository extends JpaRepository<InventoryPart, Integer> {
    
}
