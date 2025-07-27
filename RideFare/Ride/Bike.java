package RideFare.Ride;

public class Bike extends Ride{
    public Bike(){
        super("Bike",30,10,1);
    }
    public double calculateFareWithoutDiscount(double distance,double duration){
        return getBaseFare()+(getPerKmFare()*distance)+(getPerMinFare()*duration);
    }
}
