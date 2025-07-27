package Inheritance;

public class Main {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();

        // Create accounts
        BankAccount acc1 = new SavingsAccount("Alice", "SA123", 1500);
        BankAccount acc2 = new CurrentAccount("Bob", "CA456", 2000);

        // Add to bank system
        bankSystem.addAccount(acc1);
        bankSystem.addAccount(acc2);

        // === Savings Account Operations ===
        System.out.println("\n=== Alice's Account (Savings) ===");
        acc1.deposit(500);
        acc1.withdraw(1000);
        acc1.withdraw(700); // Should be blocked if below min balance
        acc1.printDetails();
        acc1.showTransactionHistory();

        // === Current Account Operations ===
        System.out.println("\n=== Bob's Account (Current) ===");
        acc2.deposit(1000);
        acc2.withdraw(2500); // Should fail
        acc2.withdraw(700);  // Should pass
        acc2.printDetails();
        acc2.showTransactionHistory();

        // === Bank System Overview ===
        System.out.println("\n--- All Accounts in System ---");
        bankSystem.showAllAccounts();

        // === Search Account ===
        BankAccount searchAcc = bankSystem.findByAccountNumber("CA456");
        if (searchAcc != null) {
            System.out.println("Account Found: " + searchAcc.getAccHolderName());
        } else {
            System.out.println("Account not found.");
        }
    }
}
