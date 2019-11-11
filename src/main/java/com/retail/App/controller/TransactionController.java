package com.retail.App.controller;

import com.retail.App.model.Transaction;
import com.retail.App.service.TransactionService;
import com.retail.App.service.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    @Qualifier("transactionService")
    TransactionService transactionService;

    @GetMapping(path = "/ping")
    public String ping() {
        return "I am alive";
    }

    @RequestMapping(value = "/{amount}", method = GET)
    @ResponseBody
    public List<Transaction> method(@PathVariable("amount") double amount) {
        return transactionService.findbyAmount(amount);
    }

    @GetMapping
    public List<Transaction> getTransaction() {
        return transactionService.list();
    }
}

