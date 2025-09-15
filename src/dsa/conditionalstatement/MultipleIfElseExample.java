package dsa.conditionalstatement;

public class MultipleIfElseExample {
    public static void main(String[] args) {

        /*
         if-else if ladder

 Used when you have multiple conditions. Program checks conditions one by one until one is true.

Syntax:

if (condition1) {
    // block1
} else if (condition2) {
    // block2
} else if (condition3) {
    // block3
} else {
    // default block
}
         * */

        int salary = 23_000;

        if (salary > 200000) {
            salary += 5000;
        } else if (salary > 20_000) {
            salary += 7000;

        } else {
            salary += 500;
        }

        System.out.println(salary);
    }

}
