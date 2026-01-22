package knacademy;

import java.util.Arrays;
import java.util.Scanner;

public class ConditionalSubarrays {
    public static int countMiniBoxes(int[] A , int x,int N){
        Arrays.sort(A);
        int left = 0;
        int right = N - 1;
        int count = 0;
        while (left < right){
            if (A[left] + A[right] <= x){
                count += (right-left);
                left++;
            } else {
                right--;
            }
        }
        for (int num : A){
            if (2 * num <= x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0 ; i < N;i++){
            A[i] = sc.nextInt();
        }
        int result = countMiniBoxes(A,x,N);
        System.out.println(result);
    }
}
