package youtubecodes;

import java.util.Scanner;

public class FellisCode {
    public static int fellisFunction(int input1){

        final int MOD = 1000000007;
        if (input1 == 0 || input1 == 1){
            return 1;
        }
        int[] dp = new int[input1+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2 ; i <= input1 ; i++){
            dp[i] = (dp[i-1] + 7 * dp[i - 2] + i / 4) % MOD;
        }
        return dp[input1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = fellisFunction(input);
        System.out.println(result);
    }
}
