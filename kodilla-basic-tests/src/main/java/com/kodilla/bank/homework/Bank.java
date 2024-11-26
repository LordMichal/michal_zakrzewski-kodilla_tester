package com.kodilla.bank.homework;

public class Bank{
    public CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank(){
        this.cashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;}

    public void addCahMachine (CashMachine cashMachine) {
        CashMachine[] newCashMachines = new CashMachine[cashMachines.length +1];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, cashMachines.length);
        newCashMachines [ cashMachines.length] = cashMachine;
        cashMachines = newCashMachines;
        numberOfCashMachines++;
        }


   public int getTotalBalance() {
        int totalBalance = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;
    }

    public int getWithdawTransactionCount() {
        int withdraws = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransaction()) {
                if (transaction < 0) {
                    withdraws++;
                }
            }
        }
        return withdraws;

    }

    public int getDepositTrasactionCount() {
        int deposit =0;
        for (CashMachine cashMachine : cashMachines){
            for (int trasaction: cashMachine.transactions){
                if (trasaction < 0){
                    deposit++;
                }
            }
        }
        return deposit;
    }

    public double getAverageWithdraw() {
        int totalWithdraw = 0;
        int withdrawaCount = 0;
        for (CashMachine cashMachine : cashMachines){
            for (int transaction : cashMachine.transactions) {
                totalWithdraw += transaction;
                withdrawaCount++;
            }
        }
        return withdrawaCount == 0? 0 : (double) totalWithdraw/withdrawaCount;
    }


    public double getAverageDeposit() {
        int totalDeposit = 0;
        int deposiyCount = 0;
        for (CashMachine cashMachine: cashMachines){
            for (int transaction : CashMachine.transactions) {
                if (transaction > 0)  {
                    totalDeposit+= transaction;
                    deposiyCount++;
                }
            }
        }
        return deposiyCount==0 ? 0 :(double) totalDeposit/deposiyCount;
    }
}

