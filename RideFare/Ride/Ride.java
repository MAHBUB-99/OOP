package RideFare.Ride;

public abstract class Ride {
    String rideType;
    double baseFare;
    double perKmFare;
    double perMinFare;

    public Ride(String rideType,double baseFare, double perKmFare, double perMinFare) {
        this.rideType = rideType;
        this.baseFare = baseFare;
        this.perKmFare = perKmFare;
        this.perMinFare = perMinFare;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        if(baseFare>=0){
            this.baseFare = baseFare;
        }
    }

    public double getPerKmFare() {
        return perKmFare;
    }

    public void setPerKmFare(double perKmFare) {
        if(perKmFare>0){
            this.perKmFare = perKmFare;
        }
    }

    public double getPerMinFare() {
        return perMinFare;
    }

    public void setPerMinFare(double perMinFare) {
        if(perMinFare>0){
            this.perMinFare = perMinFare;
        }
    }
    public abstract double calculateFareWithoutDiscount(double distance,double duration);
}
