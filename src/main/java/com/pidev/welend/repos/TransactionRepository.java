package com.pidev.welend.repos;

import com.pidev.welend.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
   // @Query("SELECT T FROM Transaction T WHERE T.
}
