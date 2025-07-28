package NetflixSubsciption;

public class WatchTimeManager {
    public void reset(User user) {
        user.setWatchTime(0);
        System.out.println("Watch time reset to 0.");
    }
}
