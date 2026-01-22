package knacademy;

import java.util.Scanner;

public class ArrangingBooks {
    public static int countFullShelves(int N , int K , int[] A){
        int carry = 0;
        int totShelves = 0;
        for (int i = 0 ; i < N ;i++){
            carry += A[i];
            totShelves += carry / K;
            carry = carry % K;
        }
        return totShelves;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
        }
        int result = countFullShelves(N,K,A);
        System.out.println(result);
    }
}
