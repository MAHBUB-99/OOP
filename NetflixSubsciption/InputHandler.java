package NetflixSubsciption;
import java.util.Scanner;

public class InputHandler {
    public static User collectUserInput(Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Choose Plan Type:");
        System.out.println("0 - Free");
        System.out.println("1 - Standard");
        System.out.println("2 - Premium");
        System.out.print("Enter Plan Type (0/1/2): ");
        int planType = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Watch Time This Month (in hours): ");
        double watchTime = Double.parseDouble(sc.nextLine());

        Subscription subscription = SubscriptionFactory.getSubscription(planType);
        return new User(name, subscription, watchTime);
    }
}
