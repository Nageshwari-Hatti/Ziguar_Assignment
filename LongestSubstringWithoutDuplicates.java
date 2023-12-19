import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {

    public static String findLongestSubstring(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        int n = input.length();
        int start = 0, end = 0;  // Pointers to track the current substring
        int maxLength = 0;  // Length of the longest substring without duplicates
        int currentLength;  // Length of the current substring without duplicates

        Map<Character, Integer> charIndexMap = new HashMap<>();

        while (end < n) {
            char currentChar = input.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                // If the character is already in the current substring, update the start pointer
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);
            end++;
            currentLength = end - start;

            if (currentLength > maxLength) {
                // Update the maximum length and pointers if a longer substring is found
                maxLength = currentLength;
            }
        }

        return input.substring(start, end);
    }

    public static void main(String[] args) {
        String input = "Welcome to PowerRouter.";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + longestSubstring);
    }
}
