package com.kodilla.bank.homework;

public class CashMachine {
    public static int[] transactions;
    //    private  int balance;
    private int numberOfTransaction;

    public CashMachine() {
        this.transactions = new int[0];
//        this.balance = 0;
        this.numberOfTransaction = 0;
    }

    public void addTransaction(int amount) {
        if (amount == 0) {
            return;
        }

        int[] newTransaction = new int[transactions.length + 1];
        System.arraycopy(transactions, 0, newTransaction, 0, transactions.length);
        newTransaction[transactions.length] = amount;
        transactions = newTransaction;
        numberOfTransaction++;
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getTransactionsCount() {
        return transactions.length;
    }

    public int[] getTransaction() {
        return null;
    }


}


