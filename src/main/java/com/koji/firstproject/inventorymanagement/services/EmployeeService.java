package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.Employee;
import com.koji.firstproject.inventorymanagement.models.Warehouse;
import com.koji.firstproject.inventorymanagement.repositories.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    EmployeeRepository employeeRepository;
    
        public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee findWarehouseById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()){
            return employee.get();
        } else {
            return null;
        }
    }

}
