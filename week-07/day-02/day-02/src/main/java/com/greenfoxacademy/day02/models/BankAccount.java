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
    private boolean king;

    public BankAccount(String name, long balance, String animalType, boolean king) {
        this.id = ID();
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.king = king;
    }

    public long getId() {
        return id;
    }

    public boolean getKing() {
        return king;
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
