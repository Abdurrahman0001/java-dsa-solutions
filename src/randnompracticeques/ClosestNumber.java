package randnompracticeques;

import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int closestNum = closestNumber(num1,num2);
        if (closestNum != -1){
            System.out.println("Closest number is: "+closestNum+" that divisible by "+num2);
        }else {
            System.out.println("Closest number not found");
        }
    }

    private static int closestNumber(int n, int m) {
        /*int result = 0;
        for (int i = n - 1; i > 0 ; i--) {
            if (i % m == 0)
                return i;
        }

        return -1;*/
        // find the quotient
        int q = n /m;
        // 1st possible closest number
        int n1 = m * q;
        // 2nd possible closest number
        int n2 = (n * m) > 0 ?(m*(q+1)):(m*(q-1));
        if (Math.abs(n -n1) < Math.abs(n - n2))
        return n1;
        else
            return n2;
    }
}
