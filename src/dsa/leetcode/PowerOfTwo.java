package dsa.leetcode;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPowerOfTwo(num));
    }

    private static boolean isPowerOfTwo(int num) {
        // edge case
        // never comes value of power of two in negative.
        // all value will be even except 1 that is edge case.Handle here.
        if (num < 1) {
            return false;
        } else if (num == 1) {
            return true;
        } else {

            while (num % 2 == 0) {
                num = num / 2;
            }
            if (num == 1) {
                return true;
            } else return false;
        }

    }
}
