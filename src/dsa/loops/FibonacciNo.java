package dsa.loops;

import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);

        int num = in.nextInt();

        int first = 0;
        int second= 1;

        int count = 2;

        while (count <= num){
            int temp = second;
            second = first + second;
            first = temp;
            count++;
        }

        System.out.println("Fabonacci number of "+num+ " is "+ second);
    }
}
