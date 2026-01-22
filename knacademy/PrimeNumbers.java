package knacademy;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        int i = 2;
        while (i * i < n){
            if (n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= b || a < 1 || b < 1){
            System.out.println("Invalid Input !");
        }
        for (int i = a ; i < b ; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
