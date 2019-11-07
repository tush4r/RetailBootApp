package com.retail.App.service;

import com.retail.App.model.Transaction;
import com.retail.App.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    public List<Transaction> list() {
        return transactionRepository.findAll();
    }

//    public List<Transaction> findbyAmount(double amount) {
//        return transactionRepository.findByAmount(amount);
//    }
}
