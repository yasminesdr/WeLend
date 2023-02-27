package com.pidev.welend.repos;
import com.pidev.welend.entities.Account;
import com.pidev.welend.entities.accountType;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account,Integer> {
    List<Account> findByTypeAccount(accountType type);

    //@Query("SELECT a FROM Account a WHERE a.client.clientID= :id ")
    //List<Account> getlistAccCLIENT(@Param("id") Long id);
}
