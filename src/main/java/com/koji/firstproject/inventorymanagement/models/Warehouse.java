package com.koji.firstproject.inventorymanagement.models;

import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "WAREHOUSE")
public class Warehouse {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "location")
    private String location;

    @JsonBackReference(value="warehouse-employees")
    @OneToMany(targetEntity = Employee.class, mappedBy = "warehouse")
    private List<Employee> employees;

    @JsonBackReference(value="warehouse-inventory")
    @OneToOne(targetEntity = Inventory.class, mappedBy = "warehouse", cascade = {CascadeType.ALL})
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    private Inventory inventory;

}
