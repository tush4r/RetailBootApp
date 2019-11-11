package com.retail.App.service;

import com.retail.App.model.Product;
import com.retail.App.model.Transaction;

import java.util.List;

public interface TransactionService {

    public List<Transaction> list() ;

    public List<Transaction> findbyAmount(double amount);
}
