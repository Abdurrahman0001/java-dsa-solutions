package randnompracticeques;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();;

        boolean isEven  = isEven(number);
        if (isEven){
            System.out.println(number+" is even number.");
        }
        else {
            System.out.println(number+" is odd number.");
        }
    }

    private static boolean isEven(int number) {

        return (number % 2 == 0);
    }
}
