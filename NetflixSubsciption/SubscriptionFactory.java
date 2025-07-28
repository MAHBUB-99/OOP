package NetflixSubsciption;

class SubscriptionFactory {
    public static Subscription getSubscription(int subscriptionType) {
        return switch (subscriptionType) {
            case 0 -> new Free();
            case 1 -> new Standard();
            case 2 -> new Premium();
            default -> throw new IllegalArgumentException("Invalid subscription type.");
        };
    }
}
