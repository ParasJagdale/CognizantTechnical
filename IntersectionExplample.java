import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionExplample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1 ; i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2  = new int[n2];
        for (int i = 0 ; i < n2 ; i++){
            arr2[i] = sc.nextInt();
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1){
            set1.add(num);
        }
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int num : arr2){
            if (set1.contains(num)){
                intersection.add(num);
                set1.remove(num);
            }
        }
        if (intersection.isEmpty()){
            System.out.println("No Common Employees !");
        } else {
            for (int num : intersection){
                System.out.print(num+" ");
            }
        }
    }
}
