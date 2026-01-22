package knacademy;

import java.util.Scanner;

public class Kaprekar {
    public static void kaprekarNumbers(int p , int q){
        boolean found = false;
        for (int n = p ; n <= q ; n++){
            int d = String.valueOf(n).length();
            long nSquared = (long) n * n;
            String squaredStr = String.valueOf(nSquared);
            String rStr = squaredStr.length() >= d ? squaredStr.substring(squaredStr.length() - d) : squaredStr;
            String lStr = squaredStr.length() > d ? squaredStr.substring(0,squaredStr.length() - d) : "0";
            long l = Long.parseLong(lStr);
            long r = Long.parseLong(rStr);
            if (l + r == n){
                System.out.print(n+" ");
                found = true;
            }
        }
        if (!found){
            System.out.println("Invalid Range !");
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        kaprekarNumbers(p,q);
        sc.close();
    }
}
