public class Test {
    static int fibo(int n){
        if(n <= 1){
            return n;
        }
        int fib1 = 0;
        int fib2 = 1;
        int fibn = 0;
        for(int i = 2 ; i <= n ; i++){
            fibn = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibn;
        }
        return fibn;
    }

    public static void main(String[] args) {
        int result = fibo(10);
        System.out.println(result);
    }
}
