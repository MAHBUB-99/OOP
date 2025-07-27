package Inheritance;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private static int idCounter = 1000;

    private final int accountId;
    private String accHolderName;
    private String accNumber;
    private double balance;

    private final List<Transaction> transactions = new ArrayList<>();

    // Constructor
    public BankAccount(String accHolderName, String accNumber, double balance) {
        this.accountId = ++idCounter;
        setAccHolderName(accHolderName);
        setAccNumber(accNumber);
        setBalance(balance);
    }

    // Getters and Setters (Encapsulated)
    public int getAccountId() {
        return accountId;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        if (accHolderName != null && !accHolderName.trim().isEmpty()) {
            this.accHolderName = accHolderName;
        } else {
            throw new IllegalArgumentException("Account Holder Name can't be null or empty.");
        }
    }

    protected String getAccNumber() {
        return accNumber;
    }

    protected void setAccNumber(String accNumber) {
        if (accNumber != null && !accNumber.trim().isEmpty()) {
            this.accNumber = accNumber;
        } else {
            throw new IllegalArgumentException("Account number can't be null or empty.");
        }
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: $" + amount);
            logTransaction("DEPOSIT", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Transaction Handling
    protected void logTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public void showTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("--- Transaction History for Account ID " + accountId + " ---");
            for (Transaction tx : transactions) {
                tx.print();
            }
        }
    }

    // Abstract methods
    public abstract void withdraw(double amount);
    public abstract void printDetails();
}
