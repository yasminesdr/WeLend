package com.pidev.welend.Repository;

import com.pidev.welend.entities.LoanTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanTransactionRepository extends JpaRepository <LoanTransaction,Integer> {
}
