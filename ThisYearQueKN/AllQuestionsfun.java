package ThisYearQueKN;

public class AllQuestionsfun {
    /*
    You are given a sentence S, and your task is to find and return a string value representing the longest word in S that has an even length and starts with a vowel (case insensitive). If multiple words have the same maximum even length, return the first occurring one. If no such word exists, return "00"
     */
    public String findLongestWord(String S){
        String[] words = S.split(" ");
        int maxLen = 0;
        String result = "00";
        for (String word : words){
            if (word.length() % 2 == 0 && startWithVowel(word)){
                if (word.length() > maxLen){
                    maxLen = word.length();
                    result = word;
                }
            }
        }
        return result;
    }
    private boolean startWithVowel(String word){
        if (word.isEmpty()){
            return false;
        }
        char ch = Character.toLowerCase(word.charAt(0));
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u';
    }

    /*
    You are given an array A of size N consisting of integers and you have to determine a hop value H by following the conditions below:
     */
    public int noOfHops(int N , int[] A){
        for (int H = 1 ; H < N ; H++){
            int idx = 0;
            boolean valid = true;
            while (idx < N){
                if (A[idx] % 2 != 0){
                    valid = false;
                    break;
                }
                idx += H;
            }
            if (valid){
                return H;
            }
        }
        return -1;
    }
    /*
    The input is a 6-bit integer, representing button states (1 → pressed, 0 → unpressed).

You need to toggle the 1st, 3rd, and 5th bits, where bits are counted from the right (1-based).
     */
    public int applyPartyMode(int input1){
        int mask = 1 | 4 | 16;
        return input1 ^ mask;
    }

    // new Question
    public int circularAlphabetSum(String S){
        int sum = 0;
        for (int i = 0 ; i < S.length()-1;i++){
            int val1 = S.charAt(i) - 'a' + 1;
            int val2 = S.charAt(i+1) - 'a' + 1;
            sum += Math.abs(val2-val1);
        }
        return sum;
    }
    /*
    Find the first continuous segment of length K where:

Temperatures are strictly increasing or strictly decreasing.

Return that segment as it appears in the input.

If none found → return "No valid trend found".
     */
    public String findTemperatureTrend(int K, String S) {
        String[] parts = S.split(" ");
        int n = parts.length;
        int[] temps = new int[n];

        // Convert temperature strings to integers
        for (int i = 0; i < n; i++) {
            temps[i] = Integer.parseInt(parts[i].replace("C", ""));
        }

        // Check each segment of length K
        for (int i = 0; i <= n - K; i++) {
            boolean increasing = true;
            boolean decreasing = true;

            for (int j = i; j < i + K - 1; j++) {
                if (temps[j] >= temps[j + 1]) {
                    increasing = false;
                }
                if (temps[j] <= temps[j + 1]) {
                    decreasing = false;
                }
            }

            if (increasing || decreasing) {
                // Build and return the segment as it appeared in input
                StringBuilder result = new StringBuilder();
                for (int j = i; j < i + K; j++) {
                    if (j > i) result.append(" ");
                    result.append(parts[j]);
                }
                return result.toString();
            }
        }
        return "No valid trend found";
    }
/*
    You are simulating a smart grocery cart with RFID-based automated billing.

Each item has a product code (1 to 15) and a price.

The transaction is a string of operations where:

>ProductCode → add the item to the cart.

<ProductCode → remove the item from the cart.

If you try to remove a product not in the cart or the format is incorrect → return -1.

At the end, return the total bill (sum of prices of items left in the cart).
 */
static int amount[] = {0,50,30,40,25,60,80,35,55,45,90,20,75,100,65,85};

    public int calculateBill(String s) {
        int totalBill = 0;
        int[] items = new int[amount.length];

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch != '>' && ch != '<') {
                return -1;
            }
            i++;
            if (i >= s.length() || !Character.isDigit(s.charAt(i))) {
                return -1;
            }

            int num = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }

            if (num < 1 || num > 15) {
                return -1;
            }

            if (ch == '>') {
                items[num]++;
                totalBill += amount[num];
            } else { // ch == '<'
                items[num]--;
                if (items[num] < 0) {
                    return -1;
                }
                totalBill -= amount[num];
            }
        }

        return totalBill;
    }
    /*

     */
    public int countMismatches(int N , String S){
        int i = 0;
        int j = S.length() - 1;
        int misMatches = 0;
        while (i < j){
            if (S.charAt(i) != S.charAt(j)){
                misMatches++;
            }
            i++;
            j--;
        }
        return misMatches;
    }
    /*
    Each car starts at position 0 with speed 0.

Every second, the speed increases by its acceleration A[i].

The car moves by its current speed every second.

You need to calculate how far the X-th car travels after S minutes.
     */
    public int totalDistance(int N, int[] A, int X, double S) {
        int totalSeconds = (int)(S * 60); // Convert minutes to seconds
        int acceleration = A[X - 1];     // Convert 1-based index to 0-based
        int speed = 0;

        int distance = 0;

        for (int t = 0; t < totalSeconds; t++) {
            speed += acceleration;      // Increase speed
            distance += speed;          // Move by current speed
        }

        return distance;
    }
}
