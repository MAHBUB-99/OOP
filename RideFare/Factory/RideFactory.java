package RideFare.Factory;

import RideFare.Ride.*;


public class RideFactory {
    public static Ride getRide(int ride){
        return switch (ride){
            case 1-> new Standard();
            case 2-> new Premium();
            case 3-> new Bike();
            default -> throw new IllegalArgumentException("Invalid ride type");
        };
    }
}
