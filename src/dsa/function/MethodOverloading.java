package dsa.function;

public class MethodOverloading {

    //sum of two numbers
    public static int sum(int x, int y) {
        return x + y;
    }

    //sum of three numbers
    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    // calculate the sum of floating number
    public static float sum(float x, float y) {
        return x + y;
    }


    public static void main(String[] args) {

        System.out.println(sum(5, 5));
        System.out.println(sum(2, 3, 5));
        System.out.println(sum(2.0f, 3.5f));


    }
}
