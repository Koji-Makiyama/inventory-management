package com.koji.firstproject.inventorymanagement.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CUST_ORDER")
public class CustomerOrder {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(targetEntity = CustomerOrderPart.class, mappedBy = "customerOrder")
    private List<CustomerOrderPart> partsOrdered;

    @ManyToOne
    @JoinColumn(name = "customer", nullable=false)
    private Customer customer;
}
