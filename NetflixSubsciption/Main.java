package NetflixSubsciption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Netflix Subscription Billing ===");
            User user = InputHandler.collectUserInput(sc);
            ConsoleUI consoleUI = new ConsoleUI(user);
            consoleUI.showMenu();

            System.out.print("\nDo you want to calculate for another user? (yes/no): ");
            String again = sc.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close();
    }
}