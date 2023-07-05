package com.koji.firstproject.inventorymanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "INVENTORY")
@Data
public class Inventory {

    @Column(name = "quant_avail")
    private String quantityAvailable;

}
