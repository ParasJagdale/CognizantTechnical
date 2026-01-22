package knacademy;

import java.util.Scanner;

public class AppraisalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary ");
        double salary = sc.nextDouble();
        System.out.println("Enter the Rating ");
        double rating = sc.nextDouble();
        if (salary < 0 || rating < 1 || rating > 5){
            System.out.println("Invalid Input !");
        } else {
            double increment = 0;
            if (rating >= 1 && rating <= 3){
                increment = 0.10 * salary;
            } else if (rating > 3 && rating <=4) {
                increment = 0.25 * salary;
            } else if (rating > 4 && rating <= 5) {
                increment = 0.30 * salary;
            }
            double newSalary = salary + increment;
            System.out.println((int) newSalary);
        }
        sc.close();
    }

}
