package com.pidev.welend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Transaction")
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="transactionID")
    private Integer transactionID;
    @ManyToOne Account account;
    private Integer reciever;
    @Enumerated(EnumType.STRING)
    private transactionType transactionType;
    @Enumerated(EnumType.STRING)
    private transactionStatus transactionStatus;
    @Enumerated(EnumType.STRING)
    private  transactionMethod transactionMethod;
    private String transactionPurpuse;
    private float exchangeRate;
    private float amount;
    private String currency;
    private float fees;
    private Date transactionDate;
    @ManyToOne transactionCategory transactionCategory;

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Integer getReciever() {
        return reciever;
    }

    public void setReciever(Integer reciever) {
        this.reciever = reciever;
    }

    public com.pidev.welend.entities.transactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(com.pidev.welend.entities.transactionType transactionType) {
        this.transactionType = transactionType;
    }

    public com.pidev.welend.entities.transactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(com.pidev.welend.entities.transactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public com.pidev.welend.entities.transactionMethod getTransactionMethod() {
        return transactionMethod;
    }

    public void setTransactionMethod(com.pidev.welend.entities.transactionMethod transactionMethod) {
        this.transactionMethod = transactionMethod;
    }

    public String getTransactionPurpuse() {
        return transactionPurpuse;
    }

    public void setTransactionPurpuse(String transactionPurpuse) {
        this.transactionPurpuse = transactionPurpuse;
    }

    public float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public com.pidev.welend.entities.transactionCategory getTransactionCategory() {
        return transactionCategory;
    }

    public void setTransactionCategory(com.pidev.welend.entities.transactionCategory transactionCategory) {
        this.transactionCategory = transactionCategory;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", account=" + account +
                ", reciever=" + reciever +
                ", transactionType=" + transactionType +
                ", transactionStatus=" + transactionStatus +
                ", transactionMethod=" + transactionMethod +
                ", transactionPurpuse='" + transactionPurpuse + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", fees=" + fees +
                ", transactionDate=" + transactionDate +
                ", transactionCategory=" + transactionCategory +
                '}';
    }

    public Transaction(Integer transactionID, Account account, Integer reciever, com.pidev.welend.entities.transactionType transactionType, com.pidev.welend.entities.transactionStatus transactionStatus, com.pidev.welend.entities.transactionMethod transactionMethod, String transactionPurpuse, float exchangeRate, float amount, String currency, float fees, Date transactionDate, com.pidev.welend.entities.transactionCategory transactionCategory) {
        this.transactionID = transactionID;
        this.account = account;
        this.reciever = reciever;
        this.transactionType = transactionType;
        this.transactionStatus = transactionStatus;
        this.transactionMethod = transactionMethod;
        this.transactionPurpuse = transactionPurpuse;
        this.exchangeRate = exchangeRate;
        this.amount = amount;
        this.currency = currency;
        this.fees = fees;
        this.transactionDate = transactionDate;
        this.transactionCategory = transactionCategory;
    }
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }
}
