package dsa.pattern;

import java.util.Scanner;

public class SquarePattern {

    /**
     *  First loop identify the row that is in the square pattern.
     *  Second loop identify the column and print the star.
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("***** Square Pattern *****");
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int column = sc.nextInt();
        printSquarePattern(row, column);

    }

    private static void printSquarePattern(int row, int column) {

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= column; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}

