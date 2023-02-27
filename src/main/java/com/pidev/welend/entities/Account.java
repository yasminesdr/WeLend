package com.pidev.welend.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table( name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="accountID")
    private Integer accountID;
@Enumerated(EnumType.STRING)
    private  accountType accountType;
@Enumerated(EnumType.STRING)
    private statusAccount statusAccount;
    private Date openDate;
    private float credit ;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "account")//esm lattribut moush lclass
    private Set<Transaction> transactions;
<<<<<<< Updated upstream
=======
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
    private Set<insurance> insurances;
    @ManyToOne Client client;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "account")
    private Set<Notification> notifications;
    // **************************

    public float getCredit() {
        return credit;
    }
    public void setCredit(float credit) {
        this.credit = credit;
    }

    public statusAccount getStatusAccount() {
        return statusAccount;
    }
    public void setStatusAccount(statusAccount state) {
        this.statusAccount = state;
    }
    public accountType getTypeAccount() {
        return accountType;
    }
    public void setAccountType(accountType accountType) {
        this.accountType = accountType;
    }
    public Client getClientAcc() {
        return client;
    }
    public void setClientAcc(Client c) {
        this.client = c;
    }
    @JsonIgnore
    public Set<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getOpenDate() {
        return openDate;
    }
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }


    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", credit=" + credit + ", openDate=" + openDate
                + ", AccountStatus=" + statusAccount + ", AccountType=" + accountType + ", Client=" + client + ", Transactions="
                + transactions + "]";
    }
    public Account(Integer accountID, float credit, Date openDate, statusAccount statusAccount, accountType accountType,
                   Client client, Set<Transaction> transactions) {
        super();
        this.accountID = accountID;
        this.credit= credit;
        this.openDate = openDate;
        this.statusAccount = statusAccount;
        this.accountType = accountType;
        this.client = client;
        this.transactions = transactions;
    }
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }



>>>>>>> Stashed changes




}
