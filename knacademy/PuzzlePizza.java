package knacademy;

import java.util.Scanner;

public class PuzzlePizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int PIZZA_PRICE = 100;
        final int PUFF_PRICE = 20;
        final int COOLDRINK_PRICE = 10;
        System.out.print("Enter the no of pizzas bought :");
        int pizzas = sc.nextInt();

        System.out.print("Enter the no of puffs bought :");
        int puffs = sc.nextInt();

        System.out.print("Enter the no of cool drinks bought :");
        int cooldrinks = sc.nextInt();

        int total = pizzas * PIZZA_PRICE + puffs * PUFF_PRICE + cooldrinks * COOLDRINK_PRICE;

        System.out.println("Bill Details :");
        System.out.println("No of pizzas:" + pizzas);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + cooldrinks);
        System.out.println("Total price=" + total);
        System.out.println("ENJOY THE SHOW!!!");

        sc.close();
    }
}
