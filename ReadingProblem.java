import java.util.Arrays;

public class ReadingProblem {
    public static int maxBooks(int[] books, int totalHours) {
        Arrays.sort(books);
        int count = 0 , sum = 0;
        for (int time : books){
            if (sum + time < totalHours) {
                sum += time;
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] books = {4,2,3,1};
        int totalHours = 5;
        int result = maxBooks(books,totalHours);
        System.out.println(result);
    }
}
