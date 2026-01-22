package InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;

public class BasicCodes {
    public int factorial(int n ){
        int fact = 1;
        for (int i = 1 ; i <= n ; i++){
            fact *= i;
        }
        return fact;
    }
    public void prime(int n){
        boolean isPrime = true;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime == true && n > 1){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
    public void palindromenum(int n){
        int rev = 0;
        int temp = n;
        while (n > 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }
        if (rev == temp){
            System.out.println("Yes");
        }
        System.out.println("no");
    }
    public void reverseString(){
        String name = "paras";
        String rev = "";
        for (int i = name.length() - 1;i >= 0 ;i++){
            rev += name.charAt(i);
        }
        System.out.println("Reverse"+rev);
    }
    public void fibonacci(){
        int n1 = 0,n2 = 1 , n3;
        System.out.print(n1+" "+n2);
        for (int i = 2; i < 10 ; i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
    public void armstrong(){
        int n = 153, temp = n , sum = 0;
        while (n > 0){
            int digit = n% 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (temp == sum){
            System.out.println("Yes");
        }
        System.out.println("no");
    }
    public void sumDidits(){
        int n = 1234;
        int sum = 0;
        while (n > 0){
            int d = n % 10;
            sum += d;
            n /= 10;
        }
    }
    public void largest(){
        int[] arr = {10,4,5,78,12,32};
        int max = arr[0];
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
    public void charfreq(){
        String S = "Paras";
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : S.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
    public void anagrams(){
        String s1 = "Silent";
        String s2 = "Listen";
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)) System.out.println("Anagrams");
        else System.out.println("no anagrams !");
    }
    public void bubbleSort(){
        int[] arr = {};
        for (int i = 0; i < arr.length-1;i++){
            for (int j = i + 1 ; j < arr.length - 1 -i;i++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void selectionSort(){
        int[] arr = {};
        for (int i = 0 ; i < arr.length ; i++){
            int minidx = 0;
            for (int j = i + 1 ; j < arr.length ; j++){
                if (arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
            int temp = arr[minidx];
            arr[minidx] = arr[i];
            arr[i] = temp;
        }
    }
    public void insertionSort(){
        int[] arr = {};
        for (int i = 1 ; i < arr.length;i++){
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev] = curr;
        }
    }
    public static void main(String[] args) {

    }
}
