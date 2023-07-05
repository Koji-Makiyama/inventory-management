package com.koji.firstproject.inventorymanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.koji.firstproject.inventorymanagement.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
