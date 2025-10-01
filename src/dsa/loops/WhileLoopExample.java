package dsa.loops;

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {


        /*
        syntax:

        while(condition){
         //body
         //updation
        }
        *
        * */

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i  = 1;
        while ( i <= num){
            System.out.println(i);
            i ++;
        }
    }
}
