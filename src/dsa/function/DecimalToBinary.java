package dsa.function;

public class DecimalToBinary {
    public static void main(String[] args) {
        decimalToBinary(12);
    }

    private static void decimalToBinary(int n) {
        int pow = 0;
        int binNum = 0;
        int myNum = n;
        while (n > 0) {
            //find reminder
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of " + myNum + " is " + binNum);
    }
}
