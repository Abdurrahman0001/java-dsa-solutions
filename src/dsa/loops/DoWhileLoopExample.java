package dsa.loops;

import java.util.Scanner;

public class DoWhileLoopExample {
    public static void main(String[] args) {

        /*
        * syntax:
        * do{
        *
        * // do at-least one time any work
        * }while(condition);
        * */

        Scanner in   = new Scanner(System.in);
        int num = in.nextInt();

        do {
            System.out.println("Welcome to code compass");
            num++;
        }while (num != 10);
    }
}
