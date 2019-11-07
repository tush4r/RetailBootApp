package com.retail.App.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_id")
    @NotNull
    private Set<Transaction> transactions;
}
