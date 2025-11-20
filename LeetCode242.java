import java.util.Arrays;

public class LeetCode242 {
    public static boolean isAnagram(String s, String t) {
        // If lengths are not equal → not anagram
        if (s.length() != t.length())
            return false;

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Count characters from string s
        // Decrease count for string t
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // increase for s
            freq[t.charAt(i) - 'a']--; // decrease for t
        }

        // Check if all frequencies become zero
        for (int count : freq) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Bruite Force Approch

        /*
         * str1 = str1.toLowerCase();
         * str2 = str2.toLowerCase();
         * 
         * if (str1.length() == str2.length()) {
         * char[] str1charArray = str1.toCharArray();
         * char[] str2charArray = str2.toCharArray();
         * 
         * Arrays.sort(str1charArray);
         * Arrays.sort(str2charArray);
         * 
         * boolean result = Arrays.equals(str1charArray, str2charArray);
         * 
         * if (result) {
         * System.out.println(str1 + " " + "and" + " " + str2 +
         * " are anagrams of eachother");
         * } else {
         * System.out.println(str1 + " " + "and" + " " + str2 +
         * " are not anagrams of eachother");
         * 
         * }
         * } else {
         * System.out.println(str1 + " " + "and" + " " + str2 +
         * " are not anagrams of eachother");
         * 
         * }
         */

        // Optimized Approch

        String str1 = "hearth";
        String str2 = "earthh";

        if (isAnagram(str1.toLowerCase(), str2.toLowerCase())) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }

    }
}
