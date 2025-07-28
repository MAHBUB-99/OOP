package NetflixSubsciption;

public class PlanManager {
    public void upgrade(User user) {
        if (user.getSubscription() instanceof Premium) {
            System.out.println("Already at highest plan.");
        } else if (user.getSubscription() instanceof Standard) {
            user.setSubscription(new Premium());
            System.out.println("Upgraded to Premium.");
        } else {
            user.setSubscription(new Standard());
            System.out.println("Upgraded to Standard.");
        }
    }

    public void downgrade(User user) {
        if (user.getSubscription() instanceof Free) {
            System.out.println("Already at Free plan.");
        } else if (user.getSubscription() instanceof Standard) {
            user.setSubscription(new Free());
            System.out.println("Downgraded to Free.");
        } else {
            user.setSubscription(new Standard());
            System.out.println("Downgraded to Standard.");
        }
    }
}
