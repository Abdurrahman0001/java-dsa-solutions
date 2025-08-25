package dsa.function;

import java.util.Scanner;

public class FactorialOfN {

    public static int factorialOfN(int n) {  // n is a parameter or formal parameter
        int fact = 1;
        if (n == 0)
            return 1;
        if (n < 0) {
            return 0;
        }

        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int fact = factorialOfN(num);  // argument or actual parameter
        if (fact >= 1) {
            System.out.println("Factorial of " + num + " is: " + fact);
        } else System.out.println("Factorial is not exist for negative number.");
    }

}
