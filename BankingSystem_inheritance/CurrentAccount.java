package Inheritance;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String name, String accNum, double balance) {
        super(name, accNum, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawn $" + amount + " from Current Account.");
            logTransaction("WITHDRAW", amount);
        } else {
            System.out.println("Withdrawal failed. Check balance.");
        }
    }

    @Override
    public void printDetails() {
        System.out.println("Current Account - ID: " + getAccountId()
                + ", Name: " + getAccHolderName()
                + ", Balance: $" + getBalance());
    }
}
