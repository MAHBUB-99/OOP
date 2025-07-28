package NetflixSubsciption;

public abstract class Subscription implements Billable{
    private String subType;
    private double hourLimit;
    private double basePricePerMonth;
    private double extraPricePerHour;

    public Subscription(String subType, double hourLimit, double pricePerMonth, double extraPricePerHour) {
        setSubType(subType);
        setHourLimit(hourLimit);
        setBasePricePerMonth(pricePerMonth);
        setExtraPricePerHour(extraPricePerHour);
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public double getHourLimit() {
        return hourLimit;
    }

    public void setHourLimit(double hourLimit) {
        if(hourLimit>0){
            this.hourLimit = hourLimit;
        }else{
            System.out.println("Watch Time must be greater than 0 hour.");
        }
    }

    public double getBasePricePerMonth() {
        return basePricePerMonth;
    }

    public void setBasePricePerMonth(double basePricePerMonth) {
        if(basePricePerMonth >=0){
            this.basePricePerMonth = basePricePerMonth;
        }else{
            System.out.println("Price Per Month must be greater or equal $0.");
        }
    }

    public double getExtraPricePerHour() {
        return extraPricePerHour;
    }

    public void setExtraPricePerHour(double extraPricePerHour) {
        if(extraPricePerHour>=0){
            this.extraPricePerHour = extraPricePerHour;
        }else{
            System.out.println("Extra Price Per Hour must be greater or equal 0");
        }
    }

    public boolean isWatchAllowed(double watchTime){
        return true;
    }

    @Override
    public double calculateBill(double watchTime) {
        double overage = Math.max(0,watchTime-getHourLimit());
        return getBasePricePerMonth()+(overage*getExtraPricePerHour());
    }
}

class Free extends Subscription{
    Free(){
        super("Free",5.0,0.0,0.0);
    }

    @Override
    public boolean isWatchAllowed(double watchTime){
        return false;
    }

    @Override
    public double calculateBill(double watchTime) {
        return 0.0;
    }
}

class Standard extends Subscription{
    Standard(){
        super("Standard",10.0,9.99,1.0);
    }
}

class Premium extends Subscription{
    Premium(){
        super("Premium",20.0,15.99,2.0);
    }
}
