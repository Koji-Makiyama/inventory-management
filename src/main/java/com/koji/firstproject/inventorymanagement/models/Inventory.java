package com.koji.firstproject.inventorymanagement.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "INVENTORY")
public class Inventory {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference(value="inventory-warehouse-id")
    @OneToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    @JsonBackReference(value="inventory-order-parts")
    @OneToMany(targetEntity = InventoryPart.class, mappedBy = "inventory")
    private List<CustomerOrderPart> parts;

}
