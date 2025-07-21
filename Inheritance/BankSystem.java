package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class BankSystem {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public BankAccount findByAccountNumber(String accNum) {
        for (BankAccount acc : accounts) {
            if (acc.getAccNumber().equals(accNum)) {
                return acc;
            }
        }
        return null;
    }

    public void showAllAccounts() {
        for (BankAccount acc : accounts) {
            acc.printDetails();
        }
    }
}
