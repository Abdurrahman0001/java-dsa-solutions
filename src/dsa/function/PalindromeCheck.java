package dsa.function;

public class PalindromeCheck {

    public static boolean isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;
        while (num > 0){
            int rem = num % 10;
            reverse  = reverse * 10 + rem;
            num  = num /10;
        }
        if (palindrome == reverse)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        if (palindrome){
            System.out.println("Palindrome number");
        }
        else
            System.out.println("Not palindrome");

    }
}
