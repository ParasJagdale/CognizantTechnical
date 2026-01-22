public class PenSwitching {
    public static int countSwitches(int[] Sequence){
        int switches = 0;
        for (int i = 1 ; i < Sequence.length; i++){
            if (Sequence[i - 1] % 2 != 0 && Sequence[i] % 2 == 0){
                switches++;
            }
        }
        return switches;
    }

    public static void main(String[] args) {
        int[] Sequence = {1,2,1,6,10,9};
        int result = countSwitches(Sequence);
        System.out.println(result);
    }

}
