package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koji.firstproject.inventorymanagement.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
