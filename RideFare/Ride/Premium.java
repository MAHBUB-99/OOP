package RideFare.Ride;

public class Premium extends Ride{
    public Premium(){
        super("Premium",100,30,3);
    }
    public double calculateFareWithoutDiscount(double distance,double duration){
        return getBaseFare()+(getPerKmFare()*distance)+(getPerMinFare()*duration);
    }
}
