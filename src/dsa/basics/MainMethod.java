package dsa.basics;

import dsa.DsaUtils;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        /**
         *
         * variable: variable just like a container
         *           where we can store value.
         *
         * Data Types: pre-built type from this we can specify which
         *             type of data we can store in the variable.
         *
         *              Data Types are:
         *                              int
         *                              byte
         *                              short
         *                              long
         *                              float
         *                              double
         *                              char
         *                              boolean
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first No: ");
        int firstNo = sc.nextInt();
        System.out.printf("Enter second No: ");
        int secondNo = sc.nextInt();

        System.out.printf("Enter third No: ");
        int third = sc.nextInt();

        /** call the sum method*/
/*        int sum = DsaUtils.sum(firstNo, secondNo);
        System.out.println("Sum of "+firstNo+" and "+secondNo+": "+sum);*/

/*        BasicUtil.add(firstNo, secondNo);
        BasicUtil.subtract(firstNo, secondNo);
        BasicUtil.multiply(firstNo, secondNo);
        BasicUtil.divide(firstNo, secondNo);*/

        BasicUtil.swapTwoNumber(firstNo, secondNo);
        BasicUtil.avgOfThree(firstNo,secondNo,third);
    }
}
