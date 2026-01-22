package knacademy;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfHalf {
    public static void processArray(int[] arr){
        int n = arr.length;
        int mid = n / 2;
        int sumFirst = 0;
        for (int i = 0 ; i < mid ;i++){
            sumFirst += arr[i];
        }
        int sumSecond = 0;
        for (int i = mid; i < n;i++){
            sumSecond += arr[i];
        }
        if (sumFirst < sumSecond){
            reverse(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        processArray(arr);
        sc.close();
    }
}
