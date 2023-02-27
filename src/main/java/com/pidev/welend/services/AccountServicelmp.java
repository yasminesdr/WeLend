package com.pidev.welend.services;
import com.pidev.welend.entities.Account;


import java.util.List;
import java.util.Set;


import com.pidev.welend.entities.Transaction;
import com.pidev.welend.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServicelmp implements IAccountService {
    @Autowired
    AccountRepository accountrepository ;
    @Override
    public List<Account> retrieveAllAccounts() {
        return  (List<Account>)accountrepository.findAll();
    }

    @Override
    public Account addAccount(Account a) {
        //Client client = new (Client);
        //a.setClientAcc(client);
        a.setCredit(5);
        accountrepository.save(a) ;
        return a;
    }

    @Override
    public void deleteAccount(Integer id) {
        accountrepository.deleteById(id);

    }

    @Override
    public Account updateAccount(Account a, Integer id) {
// TODO Auto-generated method stub
        Account  account = accountrepository.findById(id).orElse(null);
        account.setCredit(a.getCredit());
        account.setStatusAccount(a.getStatusAccount());
        account.setAccountType(a.getTypeAccount());
        accountrepository.save(account) ;
        return a;    }

    @Override
    public Set<Transaction> retrieveAllTransactionsByAccount(Integer accountID) {
        Account a=accountrepository.getReferenceById(accountID);
        Set<Transaction> list=a.getTransactions();
        return list;
    }

    @Override
    public Account retrieveAccount(Integer id) {
        Account  a = accountrepository.findById(id).orElse(null);
        return a;    }

}
