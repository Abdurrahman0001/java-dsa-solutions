package dsa.pattern;

import java.util.Scanner;

public class StarPattern1 {

    /**
     * Ques: Print the rectangle pattern?
     * Approach to solve:
     * step 1: Take input the line
     * step 2: In first loop that start from 1 to line that user input.
     * step 3: In second loop print the line
     */

    public static void main(String[] args) {
        System.out.println("***** Star Pattern ******");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line number: ");
        int line = sc.nextByte();
        printRectangle(line);

    }

    private static void printRectangle(int line) {
        for (int i = 1; i <=line ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
