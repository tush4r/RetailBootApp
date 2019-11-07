package com.retail.App.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cust_id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "tid", cascade = CascadeType.ALL)
    @NotNull
    private List<Transactions> transactions;
}
