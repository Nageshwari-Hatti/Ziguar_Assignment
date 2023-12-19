public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;  // Number of Fibonacci numbers to generate
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Series (first " + n + " numbers): ");

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
