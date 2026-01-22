package youtubecodes;

public class NoofRemoval {
    public static int minimumRemovals(String input1){
        int removals = 0;
        for (int i = 1 ; i < input1.length() ; i++){
            if (input1.charAt(i) == input1.charAt(i-1)){
                removals++;
            }
        }
        return removals;
    }

    public static void main(String[] args) {
        String input = "XYXXYXXY";
        int result = minimumRemovals(input);
        System.out.println(result);
    }
}
