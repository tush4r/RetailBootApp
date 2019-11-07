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


    @Query("SELECT customer_id, date FROM transaction t where t.amount = :amount ORDER BY date")
    public List<Transaction> findByAmount(@Param("amount") double amount);

    @Query("SELECT customer_id, date FROM transaction t where t.date = :date ORDER BY date")
    public List<Transaction> findByDate(@Param("date") Date time);

    @Query("SELECT customer_id, date FROM transaction t where t.product_id = :amount ORDER BY date ")
    public List<Transaction> findByProductId(int id);
}
