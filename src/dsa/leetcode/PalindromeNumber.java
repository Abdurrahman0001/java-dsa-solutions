package dsa.leetcode;

import java.util.Scanner;


public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int number) {
        int num = number;
        int reminder = 0;
        int reverseNum = 0;
        while (num > 0) {
            reminder = num % 10;
            reverseNum = reverseNum * 10 + reminder;
            num = num / 10;
        }

        if (number == reverseNum) {
            return true;
        }
        return false;
    }
}
