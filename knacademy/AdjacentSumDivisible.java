package knacademy;

import java.util.Scanner;

public class AdjacentSumDivisible {
    public static int sumOfDivisibleElements(int N , int X){
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0 ; i < N ; i++){
            A[i] = i + 1;
        }
        for (int i = 0; i < N ; i++){
            int nextIdx = (i+1) % N;
            B[i] = A[i] + A[nextIdx];
        }
        int sum = 0;
        for (int num : B){
            if (num % X == 0){
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int result = sumOfDivisibleElements(N,X);
        System.out.println(result);
    }
}
