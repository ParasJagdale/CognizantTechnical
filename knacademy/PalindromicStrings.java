package knacademy;
import java.util.Scanner;

public class PalindromicStrings {
    public static int countPalindromicWays(int M , String S){
        int n = S.length();
        int result = 1;
        for (int i = 0 ; i < n/2 ;i++){
            char left = S.charAt(i);
            char right = S.charAt(n-1-i);
            if (left != '?' && right != '?'){
                if (left != right){
                    return 0;
                }
            } else if (left == '?' && right == '?') {
                result = (result*26) % M;
            }
        }
        if (n % 2 != 0 && S.charAt(n/2) == '?'){
            result = (result * 26) % M;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M & String");

        int M = sc.nextInt();
        String S = sc.nextLine();
        int result = countPalindromicWays(M,S);
        System.out.println(result);
        sc.close();
    }
}
