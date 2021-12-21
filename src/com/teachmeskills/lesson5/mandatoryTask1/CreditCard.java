package com.teachmeskills.lesson5.mandatoryTask1;

public class CreditCard {

    int accountNumber;
    int balance;

    public CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount) {

        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int getBalance() {
        return balance;

    }


}
