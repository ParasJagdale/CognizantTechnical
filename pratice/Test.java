package pratice;
import java.lang.String;
import java.util.Arrays;
import java.util.HashSet;

public class Test {
    // Que 1
    public String maxWord(String S){
        int maxLen = 0;
        String result = "00";
        String[] words = S.split(" ");
        for (String word : words){
            if (word.length() % 2 == 0 && isVowel(word)){
                maxLen = word.length();
                result = word;
            }
        }
        return result;
    }
    private boolean isVowel(String S){

        if (S.isEmpty()){
            return false;
        }
        char ch = Character.toLowerCase(S.charAt(0));
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    // Que 2
    public int noOfHops(int N , int[] A){
        for (int H = 1; H < N ; H++){
            int idx = 0;
            boolean isValid = true;
            while (idx < N){
                if (A[idx] % 2 != 0){
                    isValid = false;
                    break;
                }
                idx += H;
            }
            if (isValid){
                return H;
            }
        }
        return -1;
    }

    // Que 2
    public int applyPartMode(int input1){
        int mask = 1 | 4 | 16;
        return input1 ^ mask;
    }

    //Que 3
    public int circularSum(String S){
        int sum = 0;
        for (int i = 0 ; i < S.length() ; i++){
            int val1 = S.charAt(i) - 'a' + 1;
            int val2 = S.charAt(i+1) - 'a' + 1;
            sum += Math.abs(val2 - val1);
        }
        return sum;
    }

    //Que 4
    public String findTemperatureTrend(int K, String S){
        String[] parts = S.split(" ");
        int N = parts.length;
        int[] temp = new int[N];
        for (int i = 0 ; i < N ; i++){
            temp[i] = Integer.parseInt(parts[i].replace("C",""));
        }
        for (int i = 0 ; i < N-K ; i++){
            boolean increasing = true;
            boolean decresing = false;
            for (int j = i ; j < K - i - 1;j++){
                if (temp[i] >= temp[i+1]){
                    increasing = false;
                }
                if (temp[i] >= temp[i+1]){
                    increasing = false;
                }
            }
            if (increasing || decresing){
                StringBuilder result = new StringBuilder();
                for (int j = i ; i < i+K;i++){
                    if (j > i ){
                        result.append("");
                    }
                    result.append(parts[i]);
                }
                return result.toString();
            }
        }
        return "No valid";
    }
    // StarSum
    public int countStarsum(int N){
        int count = 0;
        for (int M = 1 ; M <= N ; M++){
            int StarSum = 0;
            String mStr = String.valueOf(M);
            for (int i = 0; i < mStr.length() ; i++){
                StarSum += Integer.parseInt(mStr.substring(0,i));
            }
            if (StarSum > N){
                count++;
            }
        }
        return count;
    }
    public int count_palindrome_Ways(int M ,String S){
        int n = S.length();
        int result = 1;
        for (int i = 0 ; i < n/2 ; i++){
            int left = S.charAt(i);
            int right = S.charAt(n-1-i);
            if (left != '?' && right != '?'){
                if (left != right){
                    return 0;
                }
            }
            if (left == '?' && right == '?'){
                result = (result*26) % M;
            }
        }
        if (n % 2 != 0 && S.charAt(n/2) == '?'){
            result = (result*26) % M;
        }
        return result;
    }
    public static int sumOfDivisibleElements(int N , int X){
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0 ; i < N ; i++){
            A[i] = i + 1;
        }
        for (int i = 0 ; i < N ; i++){
            int nextIdx = (i+1) % N;
            B[i] = A[i] + A[nextIdx];
        }
        int sum = 0;
        for (int num : B){
            if(num % X == 0){
                sum += num;
            }
        }
        return sum;
    }
    public static int maxPeople(int N , int X , int[] A){
        Arrays.sort(A);
        int totW = 0;
        int count = 0;
        for (int i = 0 ; i < N ; i++){
            if ((totW + A[i]) <= X){
                totW += A[i];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    public static int countUniqueCodes(int N , String S){
        HashSet<String> set = new HashSet<>();
        for (int i = 0 ; i < N ; i++){
            String group = S.substring(i,i+3);
            char[] chars = group.toCharArray();
            Arrays.sort(chars);
            String uniqueCode = new String(chars);
            set.add(uniqueCode);
        }
        return set.size();
    }
}
