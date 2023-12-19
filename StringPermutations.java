public class StringPermutations {

    public static void main(String[] args) {
        String input = "CAT";
        System.out.print("Permutations of " + input + ": ");
        printPermutations(input);
    }

    public static void printPermutations(String input) {
        printPermutationsHelper("", input);
    }

    private static void printPermutationsHelper(String prefix, String remaining) {
        int n = remaining.length();

        if (n == 0) {
            // If no characters are remaining, print the permutation
            System.out.print(prefix + " , ");
        } else {
            for (int i = 0; i < n; i++) {
                // Recursively generate permutations by fixing one character at a time
                printPermutationsHelper(prefix + remaining.charAt(i),
                                        remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }
}
