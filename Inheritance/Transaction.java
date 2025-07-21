package Inheritance;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private Timestamp timestamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void print() {
        System.out.println(type + " : $" + amount + " at - " + timestamp);
    }
}
