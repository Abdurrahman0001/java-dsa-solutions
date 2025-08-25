package dsa.function;

public class BinaryTODecimal {

    public static void binaryToDecimal(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0){
            // find last digit of binary
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            // increase power by 1
            pow++;
            // decrease binNum last digit
            binNum = binNum / 10;

        }
        System.out.print("("+myNum+")2 = ("+decNum+")10");

    }

    public static void main(String[] args) {

        binaryToDecimal(101);

    }
}
