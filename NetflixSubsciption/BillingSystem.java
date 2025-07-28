package NetflixSubsciption;

import java.util.Scanner;

class BillingSystem {

    public static void generateBill(User user) {
        Subscription plan = user.getSubscription();

        if (!plan.isWatchAllowed(user.getWatchTime())) {
            System.out.println("❌ Limit exceeded. Please upgrade to continue.");
            return;
        }

        double bill = plan.calculateBill(user.getWatchTime());

        System.out.println("\n--- Billing Summary ---");
        System.out.println("User: " + user.getName());
        System.out.println("Plan: " + plan.getSubType());
        System.out.println("Total Bill: $" + bill);
    }
}
