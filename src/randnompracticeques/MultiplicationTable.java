package randnompracticeques;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printTable(number);
    }

    private static void printTable(int number) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(number +" * "+ i +" = "+(number*i));

        }
    }
}
