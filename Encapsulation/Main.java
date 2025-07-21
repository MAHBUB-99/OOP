package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // ✅ Valid Employee
        Employee emp1 = new Employee("E101", "Alice", "IT", 22000, 1500);
        System.out.println(emp1);
        System.out.println("Eligible for Bonus: " + emp1.isEligibleForBonus());
        System.out.println();

        // ❌ Invalid name (too short), invalid dept, low base salary, and negative bonus
        Employee emp2 = new Employee("E102", "Jo", "Finance", 9000, -500);
        System.out.println(emp2); // Only valid data will be set
        System.out.println("Eligible for Bonus: " + emp2.isEligibleForBonus());
        System.out.println();

        // ✅ Semi-valid Employee (corrected later)
        Employee emp3 = new Employee("E103", "Bob", "Sales", 18000, 800);
        System.out.println(emp3);
        System.out.println("Eligible for Bonus: " + emp3.isEligibleForBonus());
        System.out.println();

        // Updating emp3's bonus to become eligible
        emp3.setBonus(1200);
        System.out.println("After updating bonus:");
        System.out.println(emp3);
        System.out.println("Eligible for Bonus: " + emp3.isEligibleForBonus());
    }
}
