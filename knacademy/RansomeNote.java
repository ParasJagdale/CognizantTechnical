package knacademy;

public class RansomeNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] counts = new int[26];
        for (char c : magazine.toCharArray()){
            counts[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()){
            counts[c - 'a']--;
            if (counts[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomeNote = "aa";
        String magazine = "aab";
        boolean result = canConstruct(ransomeNote,magazine);
        System.out.println(result);
    }
}
