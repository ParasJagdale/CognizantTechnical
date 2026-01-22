package youtubecodes;

import java.util.Scanner;

public class PyramidSum {
    public static int calculatePyramidSum(int N){
        int totSum = 0;
        for (int row = 1 ; row <= N ; row++){
            int rowSum = 0;
            for (int i = row ; i >= 1 ; i--){
                rowSum += i;
            }
            for (int i = 2 ; i <= row ; i++){
                rowSum += i;
            }
            totSum += rowSum;
        }
        return totSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows of pyramid :");
        int rows = sc.nextInt();
        int result = calculatePyramidSum(rows);
        System.out.println(result);

    }
}
