package com.retail.App.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private double amount;

    @ManyToMany(mappedBy = "products")
    Set<Transaction> transactions;

    public Product() {}

    public Product(double amount, Integer id, String name) {
        this.amount = amount;
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() { return amount; }

    public void setAmount(double amount) { this.amount = amount; }
}

