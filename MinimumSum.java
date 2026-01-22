import java.util.Arrays;
import java.util.Collections;

public class MinimumSum {
    public static int minsum(int[] A , int[] B) {
        int n = A.length;
        Arrays.sort(A);
        Integer[] BInteger = Arrays.stream(B).boxed().toArray(Integer[] :: new);
        Arrays.sort(BInteger, Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += A[i] * BInteger[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] A = {4,1,6};
        int[] B = {3,1,2};
        int result = minsum(A,B);
        System.out.println("Minimum Sum :"+result);
    }
}
