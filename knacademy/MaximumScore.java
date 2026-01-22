package knacademy;

import java.util.Scanner;

public class MaximumScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of semester:");
        int semesters = sc.nextInt();

        for (int s = 1; s <= semesters; s++) {
            System.out.println("Enter no of subjects in " + s + " semester:");
            int subjects = sc.nextInt();

            int maxMark = -1;
            System.out.println("Marks obtained in semester " + s + ":");

            for (int i = 0; i < subjects; i++) {
                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    sc.close();
                    return;
                }

                if (mark > maxMark) {
                    maxMark = mark;
                }
            }

            // Print exactly as expected, without extra spaces or newlines
            System.out.println("Maximum mark in " + s + " semester: " + maxMark);
        }

        sc.close();
    }
}
