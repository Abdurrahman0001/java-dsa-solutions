package dsa.conditionalstatement;

public class IfExample {
    /*if is a conditional statement that will execute when given expressing will be true
    *
    * syntax: if(expression){
    *
    * // Body that you want to do
    * }
    *
    * */


    public static void main(String[] args) {

        int salary = 1000;
        if(salary < 10000){
            salary = salary + 10000;
        }
        System.out.println("salary is :"+ salary);
    }

}
