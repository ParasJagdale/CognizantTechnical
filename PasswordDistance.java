public class PasswordDistance {
    // Time Complexity O(n^2)
    public static int maxDistance1(String password){
        int left = 0 , right = password.length() - 1;
        while (left < right) {
            if (password.charAt(left) != password.charAt(right)){
                return right - left;
            }
            if (password.charAt(left) == password.charAt(right)){
                if (left < right - 1){
                    right--;
                }
                else {
                    left++;
                    right = password.length() - 1;
                }
            }
        }
        return 0;
    }
    // Time Complexity O(n)
    public static int maxDistance2(String password) {
        int n = password.length();

        // Compare first character with characters from the end
        int maxDist1 = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (password.charAt(i) != password.charAt(0)) {
                maxDist1 = i;
                break;
            }
        }

        // Compare last character with characters from the start
        int maxDist2 = 0;
        for (int i = 0; i < n; i++) {
            if (password.charAt(i) != password.charAt(n - 1)) {
                maxDist2 = (n - 1) - i;
                break;
            }
        }

        // Return the maximum of both distances
        return Math.max(maxDist1, maxDist2);
    }
    public static void main(String[] args) {
        String password = "abc10";
        int result1 = maxDistance1(password);
        int result2 = maxDistance2(password);
        System.out.println(result1);
        System.out.println(result2);
    }
}
