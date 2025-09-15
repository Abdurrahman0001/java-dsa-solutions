package dsa.conditionalstatement;

public class IfElseExample {
    public static void main(String[] args) {
        /*
        * if-else : if-else statement is a one type of conditional statement that
        *           if expression will  be true then if body will be executed otherwise else part will be
        *           executed.
        *
        * Syntax:  if(expression){
        *  // Body execute if expression will be true
        * }else{
        * // otherwise else statement .
        *
        * }
        * */

        int salary = 23_000;
        if(salary > 10_000){
            salary += 1_000;
        }else {
            salary += 500;
        }

        System.out.println("salary is : "+salary);
    }
}
