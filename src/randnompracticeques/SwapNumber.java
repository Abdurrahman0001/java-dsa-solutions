package randnompracticeques;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Before swap: ");
        System.out.println("number 1: "+num1+"\n"+"number 2: "+num2);
        swapNumber(num1,num2);

    }

    private static void swapNumber(int num1, int num2) {
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: ");
        System.out.println("number 1: "+num1+"\n"+"number 2: "+num2);


    }
}
