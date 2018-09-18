package com.greenfoxacademy.day02.models;

import java.text.DecimalFormat;

public class BankAccount {
    private static DecimalFormat df2 = new DecimalFormat("#.00");

    private String name;
    private long balance;
    private String animalType;
    private String currency = "dollarka";

    public BankAccount(String name, long balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
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

    @Override
    public String toString() {
        return this.name + " " + this.animalType + " " + String.format("%s %s", df2.format(this.balance), currency);
    }
}
