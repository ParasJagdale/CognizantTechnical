package knacademy;

import java.util.Scanner;

public class DepartmentPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students place in CSE");
        int cse = sc.nextInt();
        System.out.print("Enter the no of students place in ECE");
        int ece = sc.nextInt();
        System.out.print("Enter the no of students place in MECH");
        int mech = sc.nextInt();
        if (cse < 0 || ece < 0 || mech < 0){
            System.out.println("Invalid input!");
        }
        if (cse == ece && ece == mech){
            System.out.println("No Department got Highest placement !");
        }
        if (cse > ece && cse > mech){
            System.out.println("Highest Placements CSE");
        } else if (ece > cse && ece > mech) {
            System.out.println("Highest Placements ECE");
        } else if (mech > cse && mech >ece) {
            System.out.println("Highest Placements MECH");
        } else {
            System.out.println("No Department got Highest placement!");
        }
        sc.close();
    }
}
