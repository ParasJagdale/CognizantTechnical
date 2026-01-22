package knacademy;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int temp = number;
        while (temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7==0){
            System.out.println("Lucky Number !");
        } else {
            System.out.println("Sorry it's not lucky number");
        }
        sc.close();
    }
}
