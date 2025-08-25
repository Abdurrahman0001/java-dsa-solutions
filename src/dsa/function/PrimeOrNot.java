package dsa.function;

import java.util.Scanner;

public class PrimeOrNot {

    //method for check prime or not

    public static boolean isPrime(int n) {
        // boolean isPrime = true;  still no use of extra var
        // check corner case
        if (n == 2) {
            return true;
        }


/*
            this is first approach

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                // isPrime = false;
                // break;
                //return isPrime;
                return false;
            }
        }

        */

        // Optimized Approach to find prime or not
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        // System.out.println("End of the line");
        //return isPrime;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not prime");

        }
    }
}
