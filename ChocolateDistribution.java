public class ChocolateDistribution {
    public static int distributeChocolates(int n ){
        int MOD = 1_000_000_007;
        int total = 0;
        for (int i = 1; i <= n; i++){
            int chocolates = i;
            if ((i-1) % 5 == 0 || (i+1) % 5 == 0){
                chocolates += 2;
            }
            total = (total + chocolates) % MOD;
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = distributeChocolates(n);
        System.out.println(result);
    }
}
