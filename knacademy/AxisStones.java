package knacademy;

import java.util.Arrays;

public class AxisStones {
    public static int[] numMoves(int a , int b , int c){
        int[] stones = {a,b,c};
        Arrays.sort(stones);
        int x = stones[0], y = stones[1] , z = stones[2];
        int minMoves , maxMoves;
        if (y - z == 1 && z - y == 1){
            minMoves = 0;
        } else if (y - z <= 2 || z - y <= 2) {
            minMoves = 1;
        } else {
            minMoves = 2;
        }
        maxMoves = (z - x) - 2;
        return new int[]{minMoves,maxMoves};
    }

    public static void main(String[] args) {
        int[] result1 = numMoves(1,2,5);
        System.out.println(Arrays.toString(result1));
    }
}
