package pratice;

import java.util.HashSet;
import java.util.Set;

public class ZigZagMovement {
    public static int zigZag(int[] arr,int target){
        int n = arr.length;
        int index = 0;
        Set<Integer> visited = new HashSet<>();
        while (true){
            if (index < 0 || index >= n){
                return -1;
            }
            if (visited.contains(index)){
                return -1;
            }
            visited.add(index);
            if (arr[index] == target){
                return index;
            }
            if (arr[index] < target){
                index = index + arr[index];
            } else {
                index = index - arr[index];
            }
        }
    }
}
