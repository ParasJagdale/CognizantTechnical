package knacademy;

import java.util.Arrays;
import java.util.Scanner;

public class MaxWeight {
    public static int maxPeople(int N , int X , int[] A){
        Arrays.sort(A);
        int count = 0;
        int totWeight = 0;
        for (int i = 0 ; i < N ; i++){
            if ((totWeight + A[i]) <= X){
                totWeight += A[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0 ; i < N ;i++){
            A[i] = sc.nextInt();
        }
        int result = maxPeople(N,X,A);
        System.out.println(result);
    }
}
