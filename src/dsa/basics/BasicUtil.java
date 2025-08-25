package dsa.basics;

public final class BasicUtil {

    public static void add(int num1, int num2) {
        System.out.println("add of two number: " + (num1 + num2));
    }

    public static void subtract(int num1, int num2) {
        System.out.println("subtract of two number: " + (num1 - num2));
    }

    public static void multiply(int num1, int num2) {
        System.out.println("Multiply of two number: " + (num1 * num2));
    }

    public static void divide(int num1, int num2) {
        System.out.println("divide of tow numbers:" + (num1 / num2));
    }

    public static void swapTwoNumber(int num1, int num2) {

        System.out.println("Before swapping---------");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping---------");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);


    }

    public static void avgOfThree(int firstNo, int secondNo, int third) {

        System.out.println("avg of three number: " + (firstNo + secondNo + third) / 3);
    }
}
