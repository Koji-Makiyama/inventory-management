package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.InventoryPart;
import com.koji.firstproject.inventorymanagement.repositories.InventoryPartRepository;

@Service
public class InventoryPartService {
    
    @Autowired
    InventoryPartRepository partRepository;
    
    public List<InventoryPart> findAllParts() {
        return partRepository.findAll();
    }

    public InventoryPart findPartById(int id) {
        Optional<InventoryPart> part = partRepository.findById(id);

        if(part.isPresent()){
            return part.get();
        } else {
            return null;
        }
    }

}
