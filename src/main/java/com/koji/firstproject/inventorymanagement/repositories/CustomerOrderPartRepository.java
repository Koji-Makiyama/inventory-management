package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koji.firstproject.inventorymanagement.models.CustomerOrderPart;

public interface PartRepository extends JpaRepository<CustomerOrderPart, Integer> {
    
}
