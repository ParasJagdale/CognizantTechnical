package pratice;

import java.util.*;

public class DecimalSumCheck {

    public static int checkSum(String[] arr) {
        List<Integer> digits = new ArrayList<>();

        // Extract digits after the decimal point
        for (String num : arr) {
            String[] parts = num.split("\\.");
            if (parts.length > 1) {
                digits.add(Integer.parseInt(parts[1]));
            } else {
                digits.add(0); // If no decimal part, consider as 0
            }
        }

        int n = digits.size();

        // Ensure even length
        if (n % 2 != 0) {
            return -1;
        }

        int half = n / 2;

        // Calculate sum of left half
        int sumLeft = 0;
        for (int i = 0; i < half; i++) {
            sumLeft += digits.get(i);
        }

        // Calculate sum of right half
        int sumRight = 0;
        for (int i = half; i < n; i++) {
            sumRight += digits.get(i);
        }

        // Compare sums
        if (sumLeft == sumRight) {
            return 1;
        } else {
            return -1;
        }
    }

    // Main method to test cases
    public static void main(String[] args) {
        String[] testCase1 = {"0.6", "0.7", "0.8", "0.7"};
        String[] testCase2 = {"0.5", "0.4", "0.3", "0.6"};

        System.out.println(checkSum(testCase1)); // Output: -1
        System.out.println(checkSum(testCase2)); // Output: 1
    }
}
