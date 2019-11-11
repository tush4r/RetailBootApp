package com.retail.App.repository;

import com.retail.App.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository <Transaction, Integer> {
    @Query("SELECT t FROM Transaction t WHERE t.amount > :amount ORDER BY amount DESC")
    public List<Transaction> findByAmount(@Param("amount") double amount);
}
