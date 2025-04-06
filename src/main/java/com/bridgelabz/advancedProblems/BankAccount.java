package com.bridgelabz.advancedProblems;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        this.balance=balance;
    }
    public void deposit(int amnt) {
        if (amnt >= 0) {
            balance+=amnt;
        }
    }

    public int getBalance() {
        return balance;
    }


    public boolean withdraw(int amnt) {
        if (amnt > 0 && amnt <= balance) {
            balance -= amnt;
            return true;
        }
        return false;
    }
}
