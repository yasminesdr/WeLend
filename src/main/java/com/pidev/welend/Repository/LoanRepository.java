package com.pidev.welend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pidev.welend.entities.Loan;
public interface LoanRepository extends JpaRepository <Loan,Integer>{

}
