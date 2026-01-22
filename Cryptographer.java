public class Cryptographer {
    public static String decrypt(String s){
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'a'){
                result.append('z');
            } else {
                result.append((char)(ch - 1));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "bcd";
        String output = decrypt(s);
        System.out.println(output);
    }
}
