package dsa.basics;

public class OccuringNumber {
    public static void main(String[] args) {
        int num = 4759493;
        int count = 0;


        while (num >= 0) {

            int reminder = num % 10;
            if (reminder == 3) {
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
