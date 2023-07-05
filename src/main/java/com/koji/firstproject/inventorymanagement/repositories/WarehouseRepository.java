package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koji.firstproject.inventorymanagement.models.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    
}
