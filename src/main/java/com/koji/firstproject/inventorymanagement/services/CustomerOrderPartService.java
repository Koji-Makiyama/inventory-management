package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.CustomerOrderPart;
import com.koji.firstproject.inventorymanagement.repositories.CustomerOrderPartRepository;

@Service
public class CustomerOrderPartService {
    
    @Autowired
    CustomerOrderPartRepository partRepository;
    
    public List<CustomerOrderPart> findAllParts() {
        return partRepository.findAll();
    }

    public CustomerOrderPart findPartById(int id) {
        Optional<CustomerOrderPart> part = partRepository.findById(id);

        if(part.isPresent()){
            return part.get();
        } else {
            return null;
        }
    }

}
