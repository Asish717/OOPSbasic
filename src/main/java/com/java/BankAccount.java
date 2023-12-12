package com.java;

import java.util.Scanner;

public class BankAccount {
    public int balance;
    public int accountNumber;
    public BankAccount(int balance,int accountNumber){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    public void deposit(int dep){
        int total=balance+dep;
        System.out.println("Balance after deposit: "+total);
    }
    public void withdraw(int wit){
        if (wit>=balance){
            System.out.println("Invalid!!!");
        }
        else {
            int total=balance-wit;
            System.out.println("Balance after withdraw: "+total);
        }
    }
    public void info(){
        System.out.println("Account balance: "+balance);
        System.out.println("Account number: "+accountNumber);
    }
    public static void main(String[] args) {
        BankAccount acc=new BankAccount(7000,34662);
        acc.info();
        acc.deposit(4500);
        acc.withdraw(700);
    }
}
