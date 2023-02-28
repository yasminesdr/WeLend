package com.pidev.welend.Repository;

import com.pidev.welend.entities.LoanTransaction;
import com.pidev.welend.entities.LoanType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanTypeRepository  extends JpaRepository<LoanType,Integer> {
}
