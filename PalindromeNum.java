import java.util.Scanner;
public class PalindromeNum {
    public static boolean isPalidrome1(int n){
        int original = n;
        int reversed = 0;
        while (n > 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }
        return original == reversed;
    }
    public static boolean isPalidrome2(int num){
        String str = String.valueOf(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num :");
        int n = sc.nextInt();
        if (isPalidrome2(n)){
            System.out.println("Palindrome");
        } else {
            System.out.println("No palindrome");
        }
    }
}
