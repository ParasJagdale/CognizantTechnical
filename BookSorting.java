import java.util.Arrays;

public class BookSorting {
    public static int minMoves(String books){
        char[] original = books.toCharArray();
        char[] sorted = books.toCharArray();
        Arrays.sort(sorted);
        int count = 0;
        for (int i = 0 ; i < books.length() ; i++){
            if (sorted[i] != original[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String books = "asdf";
        int result = minMoves(books);
        System.out.println(result);
    }
}
