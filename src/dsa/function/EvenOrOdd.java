package dsa.function;

public class EvenOrOdd {

    public static boolean isEven(int n){
        boolean isEven = false;
        if (n % 2 == 0){
            isEven = true;
        }
        else
            isEven = false;
        return isEven;
    }


    public static void main(String[] args) {

        boolean isEven = isEven(3);
        if (isEven){
            System.out.println("Number is even ");
        }
        else
            System.out.println("Number is Odd");

    }
}
