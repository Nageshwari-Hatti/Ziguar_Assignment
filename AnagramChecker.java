import java.util.Arrays;

public class AnagramChecker {

    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "ceelmow";

        System.out.println("Input 1: " + str1);
        System.out.println("Input 2: " + str2);

        if (areAnagrams(str1, str2)) {
            System.out.println("Output: The strings are anagrams.");
        } else {
            System.out.println("Output: The strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal after removing spaces
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays, sort, and compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
}
