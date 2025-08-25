package randnompracticeques;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = sumOfNaturalNum(number);
        System.out.println("Total sum of "+number +" is: "+result);
    }

    private static int sumOfNaturalNum(int number) {
        int sum = 0;
        for (int i = 1; i <= number ; i++) {
            sum +=i;
        }
        return sum;
    }
}
