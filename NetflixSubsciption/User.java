package NetflixSubsciption;
class User {
    private String name;
    private Subscription subscription;
    private double watchTime;

    public User(String name, Subscription subscription, double watchTime) {
        setName(name);
        setSubscription(subscription);
        setWatchTime(watchTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }
}