package dsa.conditionalstatement;

public class AtmExample {

    public static void main(String[] args) {
        System.out.println("Welcome to sbi ATM");

        int storePin = 12342;
        int enteredPin = 1234;

        if (storePin == enteredPin) {

            int option = 2;

            switch (option) {

                case 1:
                    System.out.println("check balance");
                    break;

                case 2:
                    System.out.println("withdraw balance");
                    break;

                case 3:
                    System.out.println("deposite balance");
                    break;

                default:
                    System.out.println("invalid option");
            }


        } else {
            System.out.println("Access denied: Wrong pin");
        }
    }
}
