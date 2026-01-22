package knacademy;

public class LeftRotations {
    public static int[] rotLeft(int[] a, int d){
        int n = a.length;
        int[] rotated = new int[n];
        d = d % n;
        for (int i = 0; i < n ; i++){
            int newIdx = (i - d + n) % n;
            rotated[newIdx] = a[i];
        }
        return rotated;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int d = 4;
        int[] result = rotLeft(a,d);
        for (int num : result){
            System.out.print(num);
        }
    }
}
