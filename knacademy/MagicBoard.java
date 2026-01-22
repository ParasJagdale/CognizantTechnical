package knacademy;

import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0 ; i < 4 ;i++){
            A[i] = sc.nextInt();
        }
        for (int i = 0 ; i < 4 ; i++){
            char character = (char) A[i];
            System.out.println(A[i]+"-"+character);
        }
        sc.close();
    }
}
