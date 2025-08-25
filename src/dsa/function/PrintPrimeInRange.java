package dsa.function;

public class PrintPrimeInRange {
    // write program to calculate prime in range


    public static void printPrimeInRange(int n) {
        // print prime number only for given target
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        printPrimeInRange(20);
    }
}
