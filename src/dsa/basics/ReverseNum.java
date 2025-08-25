package dsa.basics;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 3749393;
        int reverseNum = 0;

        while (num >0){
            int reminder = num%10;
            reverseNum = reverseNum *10+(reminder); // 54
            num/=10;
        }

        System.out.println(reverseNum);

    }
}
