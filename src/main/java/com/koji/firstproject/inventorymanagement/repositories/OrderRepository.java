package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koji.firstproject.inventorymanagement.models.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    
}
