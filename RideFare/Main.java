package RideFare;

import RideFare.FareSystem.FareSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 for Standard");
            System.out.println("2 for Premium");
            System.out.println("3 for Bike");
            System.out.print("Enter Ride Type -");
            int rideType = scanner.nextInt();
            System.out.println("---------------------------");
            System.out.println("1 for Regular");
            System.out.println("2 for Gold");
            System.out.println("3 for Platinum");
            System.out.print("Enter User Type -");
            int userType = scanner.nextInt();
            System.out.println("---------------------------");
            System.out.print("Enter Distance : ");
            double distance = scanner.nextDouble();
            System.out.print("Enter Duration : ");
            double duration = scanner.nextDouble();
            FareSystem fareSystem = new FareSystem(rideType,userType,distance,duration);
            System.out.println("Total Fare is : "+fareSystem.CalculateFare());
            System.out.println("---------------------------");

        }
    }
}
