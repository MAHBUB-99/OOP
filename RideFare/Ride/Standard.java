package RideFare.Ride;

public class Standard extends Ride{
    public Standard(){
        super("Standard",50,20,2);
    }
    public double calculateFareWithoutDiscount(double distance,double duration){
        return getBaseFare()+(getPerKmFare()*distance)+(getPerMinFare()*duration);
    }
}
