package com.retail.App.controller;

import com.retail.App.model.Transaction;
import com.retail.App.repository.TransactionRepository;
import com.retail.App.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transaction")
@Configurable
public class TransactionController {
    @Autowired TransactionService transactionService;

    @GetMapping(path = "/ping")
    public String ping() {
        return "I am alive";
    }

    @GetMapping
    public List<Transaction> getDogs() throws Exception{
        try {
            return transactionService.list();
        } catch (Exception e) {
            System.out.println("no");
            return new ArrayList<>();
        }
    }
}

