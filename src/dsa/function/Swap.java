package dsa.function;

public class Swap {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap a : " + a);
        System.out.println("After swap b : " + b);
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap a : " + a);
        System.out.println("Before swap b : " + b);
        System.out.println("*********************************");

        swap(a, b);// here is passing copy of a and b not actual value
    }
}
