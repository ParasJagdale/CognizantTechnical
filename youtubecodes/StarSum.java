package youtubecodes;

public class StarSum {
    public static int countstarsum(int N){
        int count = 0;
        for (int M = 1 ; M <= N ; M++){
            int starSum = 0;
            String mStr = String.valueOf(M);
            for (int i = 1 ; i <= mStr.length();i++){
                starSum += Integer.parseInt(mStr.substring(0,i));
            }
            if (starSum > N){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 112;
        int result = countstarsum(N);
        System.out.println(result);
    }
}
