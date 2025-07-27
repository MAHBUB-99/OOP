package Inheritance;

public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 500;

    public SavingsAccount(String name, String accNum, double balance) {
        super(name, accNum, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= MIN_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn $" + amount + " from Savings Account.");
            logTransaction("WITHDRAW", amount);
        } else {
            System.out.println("Withdrawal denied. Maintain minimum balance of $" + MIN_BALANCE);
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Savings Account - ID: " + getAccountId()
                + ", Name: " + getAccHolderName()
                + ", Balance: $" + getBalance());
    }
}
