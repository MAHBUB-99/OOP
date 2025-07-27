package RideFare.FareSystem;

import RideFare.Factory.UserFactory;
import RideFare.Ride.Ride;
import RideFare.Factory.RideFactory;
import RideFare.User.User;

public class FareSystem {
    Ride ride;
    User user;
    double distance;
    double duration;

    public FareSystem(int ride, int user, double distance, double duration) {
        this.ride = RideFactory.getRide(ride);
        this.user = UserFactory.getUser(user);
        this.distance = distance;
        this.duration = duration;
    }
    public double CalculateFare(){
        System.out.println(user.getDiscountPercentage());
        return ride.calculateFareWithoutDiscount(distance,duration)*(1-((double)user.getDiscountPercentage()/100));
    }
}
