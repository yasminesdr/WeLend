package com.pidev.welend.services;

import java.util.List;
import com.pidev.welend.entities.insuranceTransaction;

public interface insuranceTransactionService {
    public insuranceTransaction addinsuranceTransaction(insuranceTransaction i );
    public insuranceTransaction updateAgent(insuranceTransaction i);
    public List<insuranceTransaction> getAllinsuranceTransaction();
    public insuranceTransaction getinsuranceTransactionById(Integer insuranceTransactionID);
    public void deleteinsuranceTransaction(Integer insuranceTransactionId);
}
