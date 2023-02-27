package com.pidev.welend.services;

import com.pidev.welend.entities.Transaction;
import com.pidev.welend.repos.AccountRepository;
import com.pidev.welend.repos.TransactionRepository;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServicelmp implements ITransactionService{
    @Autowired
    TransactionRepository transrepo ;
    @Autowired
    AccountRepository accrepo ;
    @Override
    public int addTransaction(Transaction s) throws MessagingException {
        return 0;
    }

    @Override
    public Transaction retrieveTransaction(Integer id) {
            Transaction  tr = transrepo.findById(id).orElse(null);
            return tr;
        }

    @Override
    public List<Transaction> retrieveAllTransactions() {
        return (List<Transaction>) transrepo.findAll();
    }

    @Override
    public List<Transaction> retrieveTransactionsByAccount(Integer id) {
        return null;
    }
}
