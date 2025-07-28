package NetflixSubsciption;

import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    private final User user;
    private final BillingSystem billingSystem = new BillingSystem();
    private final PlanManager planManager = new PlanManager();
    private final WatchTimeManager watchTimeManager = new WatchTimeManager();

    public ConsoleUI(User user) {
        this.user = user;
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Bill");
            System.out.println("2. Upgrade Plan");
            System.out.println("3. Downgrade Plan");
            System.out.println("4. Reset Watch Time");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> billingSystem.generateBill(user);
                case 2 -> planManager.upgrade(user);
                case 3 -> planManager.downgrade(user);
                case 4 -> watchTimeManager.reset(user);
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
