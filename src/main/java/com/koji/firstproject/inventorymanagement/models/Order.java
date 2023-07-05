package com.koji.firstproject.inventorymanagement.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="ORDERS")
public class Order {
        
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="quantity_requested")
    private int quantity;
    
    @JsonBackReference
    @OneToMany(targetEntity = Part.class, mappedBy = "order")
    private List<Part> partsOrdered;

}
