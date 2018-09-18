package com.greenfoxacademy.day02.models;

import com.greenfoxacademy.day02.controllers.BankAccountController;

import java.text.DecimalFormat;

public class BankAccount {
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    private long id;
    private String name;
    private long balance;
    private String animalType;
    private String currency = "dollarka";

    public BankAccount(String name, long balance, String animalType) {
        this.id = ID();
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public long getId() {
        return id;
    }

    public String getCurrency() {
        return currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int ID() {
        return BankAccountController.bankAccountList.size() + 1;
    }

    @Override
    public String toString() {
        return this.name + " " + this.animalType + " " + String.format("%s %s", df2.format(this.balance), currency);
    }
}
