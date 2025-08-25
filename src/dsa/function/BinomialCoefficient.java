package dsa.function;

import java.util.Scanner;

public class BinomialCoefficient {
    /*
     * formula for finding binomial coefficient
     *
     * nCr = n!/r!(n-r)!
     *
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int binCoef = binomialCoeficient(n, r);
        System.out.println("Binomial Coeficiat is :"+binCoef);
    }

    private static int binomialCoeficient(int n, int r) {

        // find n!
        int n_fact = nFact(n);
        int r_fact = nFact(r);
        int nminusr = nFact(n - r);
        int binomialCoeficient = n_fact / (r_fact * nminusr);
        return binomialCoeficient;
    }

    private static int nFact(int n) {

        if (n == 0)
            return 1;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
