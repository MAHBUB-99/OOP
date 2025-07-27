package RideFare.Factory;

import RideFare.User.*;

public class UserFactory {
    public static User getUser(int user){
        return switch (user){
            case 1 -> new Regular();
            case 2 -> new Gold();
            case 3 -> new Platinum();
            default -> throw new IllegalArgumentException("Invalid user type");
        };
    }
}
