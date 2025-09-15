package dsa.conditionalstatement;

public class NestedIfExample {
    /*
     * Nested if Statement:
     *                   An if inside another if: Useful when one if condition depend on other condition
     *
     * syntax:
     *
     *           if(condition 1){
     *
     *                   if(condition 2){
     *
     *                       // this block will execute when both are true.
     *                   }
     *
     *           }
     *
     * */


    public static void main(String[] args) {

        int age = 10;
        boolean hasId = true;

        if (age >= 18) {
            if (hasId) {
                System.out.println("welcome to in Club");
            } else {
                System.out.println("Id is required to enter the club");
            }
        } else {
            System.out.println("Abhi chhote ho tum.");
        }
    }
}
