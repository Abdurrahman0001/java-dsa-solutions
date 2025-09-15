package dsa.conditionalstatement;

public class SwitchExample {

    /*
    * switch statement:
    *                   Used when you want to test a single variable against
    *                   many possible values.
    *
    * syntax:
    *           switch(expression){
    *
    *               case value 1:
    *                   //block
    *                   break;
    *     *         case value 2:
     *                   //block
     *                   break;
    *               default:
    *                   //default block
    *           }
    *
    * */

    public static void main(String[] args) {

        int day =3;

        switch (day){
            case 1:
                System.out.println("Monday"); break;

            case 2:
                System.out.println("Tuesday"); break;

            case 3:
                System.out.println("Wednesday"); break;

            case 4:
                System.out.println("Thursday"); break;

            case 5:
                System.out.println("Friday"); break;


            case 6:
                System.out.println("Saturday"); break;

            case 7:
                System.out.println("Sunday"); break;

            default:
                System.out.println("Invalid input");
        }
    }
}
