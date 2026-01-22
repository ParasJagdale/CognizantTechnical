package knacademy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueCodes {
    public static int countUniqueCodes(int N , String S){
        HashSet<String> set = new HashSet<>();
        for (int i = 0 ; i < N ; i += 3){
            String group = S.substring(i,i+3);
            char[] chars = group.toCharArray();
            Arrays.sort(chars);
            String uniqueCode = new String(chars);
            set.add(uniqueCode);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        int result = countUniqueCodes(N,S);
        System.out.println(result);
    }
}
