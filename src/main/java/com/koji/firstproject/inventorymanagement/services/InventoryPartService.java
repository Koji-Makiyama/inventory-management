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
    InventoryPartRepository inventoryPartRepository;

    public List<InventoryPart> findAllInventoryParts() {
        return inventoryPartRepository.findAll();
    }

    public InventoryPart findInventoryPartById(int id) {
        Optional<InventoryPart> part = inventoryPartRepository.findById(id);

        if (part.isPresent()) {
            return part.get();
        } else {
            return null;
        }
    }

    public InventoryPart saveInventoryPart(InventoryPart inventoryPart) {
        return inventoryPartRepository.save(inventoryPart);
    }

}
