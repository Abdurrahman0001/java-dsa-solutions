package dsa.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factorial = factorialOfNum(num);
        System.out.println("Factorial of "+num+" is: "+factorial);
    }

    private static int factorialOfNum(int num) {

        //edge case
        if (num == 0)
            return 1;
        int fact  = 1;
        for (int i = 1; i <=num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
