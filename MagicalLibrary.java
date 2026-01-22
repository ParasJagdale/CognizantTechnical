public class MagicalLibrary {
    public static int countMagicalRows(int[][] Shelves) {
        int count = 0;
        for (int[] row : Shelves) {
            int sum = 0;
            int oddCount = 0;
            for (int val : row) {
                if (val % 2 != 0){
                    sum += val;
                    oddCount++;
                }
            }
            if (oddCount > 0 && sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
    // Only consider rows with at least one odd number and an even sum
    public static void main(String[] args) {
        int[][] Shelves = {{2, 4}, {0,0}, {11, 11}};
        int result = countMagicalRows(Shelves);
        System.out.println(result);
    }
}
