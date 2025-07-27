package RideFare.User;

public class User {
    String userType;
    int discountPercentage;

    public User(String userType, int discountPercentage) {
        this.userType = userType;
        this.discountPercentage = discountPercentage;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
