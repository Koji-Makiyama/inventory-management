package com.koji.firstproject.inventorymanagement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PARTS")
@Data
public class Part {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "part_description")
    private String partDescription;

    @ManyToOne
    private Order order;


}
