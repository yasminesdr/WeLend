package com.pidev.welend.services;

import com.pidev.welend.entities.Transaction;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import java.util.List;

public interface ITransactionService {
    int  addTransaction(Transaction s )throws MessagingException;
    Transaction retrieveTransaction(Integer id);
    List<Transaction> retrieveAllTransactions();
    public List<Transaction> retrieveTransactionsByAccount(Integer id);
}
