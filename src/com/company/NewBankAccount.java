package com.company;

public class NewBankAccount extends Account implements IBankAccount {

    public NewBankAccount(int i) {
        super(i);
    }

    public void debit(int i){
        super.withdraw(i);
    }

    public void credit(int i){
        super.deposit(i);
    }

    public int balance(){
        return getBalance();
    }



}
