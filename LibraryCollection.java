public class LibraryCollection {
    public static int maxBooks(int n , int k , int[] shelves){
        int total = 0;
        for (int i = 0 ; i < n; i++) {
            if (isPrime(i + 1 )){
                total += Math.min(shelves[i], k);
            }
        }
        return total;
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for (int d = 2 ; d * d <= n; d++){
            if (n % d == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 4;
        int[] shelves = {10,2};
        int result = maxBooks(n,k,shelves);
        System.out.println(result);
    }
}
