package dsa.loops;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        /*
         * input : 2234244245225
         *  find how many times 2 occuring in the input
         * */

        int num = 223424424;
        int frequency = 2;
        int count = 0;

        while (num > 0){
            int lastNo = num % 10;
            if (lastNo == frequency){
                count++;
            }
            num  = num / 10;

        }
        System.out.println("cound Is " + count);

    }
}
