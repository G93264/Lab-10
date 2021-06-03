package com.company;

public class Account {
    private int balance;

    public Account(int i) {
        balance = i;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int i){
        balance += 1;
    }

    public void withdraw(int i) {
        balance -= 1;
    }
}
