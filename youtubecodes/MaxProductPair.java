package youtubecodes;

import java.util.Arrays;
import java.util.Scanner;

public class MaxProductPair {
    public static int[] findPairs(int N ,int[] A){
        int maxProd = Integer.MIN_VALUE;
        int[] result = new int[0];
        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < N ; j++){
                if (i != j){
                    int first = A[i];
                    int second = A[j];
                    if (first + second == 18 && first > second){
                        int product = first * second;
                        if (product > maxProd){
                            maxProd = product;
                            result = new int[]{first,second};
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0 ; i < N ; i++){
            A[i] = sc.nextInt();
        }
        int[] result = findPairs(N , A);
        System.out.println(Arrays.toString(result));
    }
}
