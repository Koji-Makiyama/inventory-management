package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.koji.firstproject.inventorymanagement.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
