package NetflixSubsciption;

public interface Billable {
    double calculateBill(double watchTime);
    boolean isWatchAllowed(double watchTime);
}
