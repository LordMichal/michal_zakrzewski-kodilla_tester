package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(200);
        cashMachine1.addTransaction(-100);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(300);
        cashMachine2.addTransaction(-50);

        bank.addCahMachine(cashMachine1);
        bank.addCahMachine(cashMachine2);

        assertEquals(350, bank.getTotalBalance());
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawalsAndDeposits() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);

        bank.addCahMachine(cashMachine);

        assertEquals(2, bank.getWithdawTransactionCount());
        assertEquals(2, bank.getDepositTrasactionCount());
    }

    @Test
    public void shouldCalculateAverageWithdrawalAndDeposit() {
        Bank bank = new Bank();
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);

        bank.addCahMachine(cashMachine);

        assertEquals(-200, bank.getAverageWithdraw(), 0.01);
        assertEquals(200, bank.getAverageDeposit(), 0.01); // Fixed average calculation
    }
}
