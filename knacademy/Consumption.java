package knacademy;
import java.util.Scanner;

public class Consumption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for fuel quantity
        System.out.println("Enter the no of liters to fill the tank");
        float liters = sc.nextFloat();

        // Ask for distance covered
        System.out.println("Enter the distance covered");
        float distance = sc.nextFloat();

        // Validate inputs
        if (liters <= 0 || distance <= 0) {
            System.out.println("Invalid Input");
        } else {
            // Calculate liters per 100 km
            float litersPer100km = (liters / distance) * 100;

            // Convert distance and liters to US units
            float distanceInMiles = distance * 0.6214f;
            float fuelInGallons = liters * 0.2642f;

            // Calculate miles per gallon
            float milesPerGallon = distanceInMiles / fuelInGallons;

            // Print results with 2 decimal places
            System.out.println("Liters/100KM");
            System.out.printf("%.2f\n", litersPer100km);

            System.out.println("Miles/gallons");
            System.out.printf("%.2f\n", milesPerGallon);
        }

        sc.close();
    }
}
