package com.koji.firstproject.inventorymanagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koji.firstproject.inventorymanagement.models.Part;
import com.koji.firstproject.inventorymanagement.models.Warehouse;
import com.koji.firstproject.inventorymanagement.repositories.PartRepository;

@Service
public class PartService {
    
    @Autowired
    PartRepository partRepository;
    
    public List<Part> findAllParts() {
        return partRepository.findAll();
    }

    public Part findPartById(int id) {
        Optional<Part> part = partRepository.findById(id);

        if(part.isPresent()){
            return part.get();
        } else {
            return null;
        }
    }

}
