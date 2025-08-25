package dsa.leetcode;

public class FabonacciNumber {

    public static void main(String[] args) {
        int n = 4;
        int fabonacciNum = fibonacci(n);
        System.out.println(fabonacciNum);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 0; i < n; i++) {
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;

        }
        return firstTerm;
    }
}
