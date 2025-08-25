package dsa.basics;

import dsa.DsaUtils;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        boolean isEven = DsaUtils.isEven(num);

        if (isEven){
            System.out.println(num+" is Even");
        }
        else
            System.out.println(num+" is Odd.");
    }
}
