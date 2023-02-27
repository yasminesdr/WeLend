package com.pidev.welend.services;
import com.pidev.welend.entities.Account;
import com.pidev.welend.entities.Transaction;

import java.util.List;
import java.util.Set;

public interface IAccountService {
    List<Account> retrieveAllAccounts();
    public Account addAccount (Account a ) ;
    void deleteAccount(Integer id);
    Account updateAccount(Account a , Integer id);
    public Set<Transaction> retrieveAllTransactionsByAccount(Integer accountID );
    Account retrieveAccount(Integer id);
    //List<Account> retrieveAllaccountsByclient(Long id) ;
}
