package dsa.loops;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        //Q. Find the largest number;

       /* Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maxNo = Integer.MIN_VALUE;

        if (maxNo <= a) {
            maxNo = a;
        }
        if (maxNo <= b) {
            maxNo = b;

        }
        if (maxNo <= c) {
            maxNo = c;

        }*/

        int maxNo = Math.max(23,Math.max(230,2332));

        System.out.println("Largest number is: " + maxNo);

    }
}
