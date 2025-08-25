package dsa.function;

public class AvgOfThreeNum {
    public static void main(String[] args) {
        calAvgOfThreeNum(1,1,1);
    }

    private static void calAvgOfThreeNum(int i, int i1, int i2) {
        int avg = (i+i1+i2)/3;
        System.out.println("Avg of three number is: "+avg);
    }
}
