package knacademy;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        float liters = sc.nextFloat();
        System.out.println("Enter the distance covered");
        float distance = sc.nextFloat();
        if (liters <= 0 || distance <= 0){
            System.out.println("Invalid Input !");
        } else {
            float litersPer100km = (liters/distance) * 100;

            float distInMiles = distance * 0.6214f;
            float fuelInGallons = liters * 0.2642f;

            float milesPerGallon = distInMiles / fuelInGallons;
            System.out.println("Liters/100KM");
            System.out.printf("%.2f\n",litersPer100km);
            System.out.println("milesPerGallon");
            System.out.printf("%.2f\n",milesPerGallon);
        }
        sc.close();
    }
}
