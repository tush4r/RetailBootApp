package com.retail.App.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    @NotNull
    private String name;

    @ManyToMany(mappedBy = "tid")
    List<Transactions> transaction;
}

