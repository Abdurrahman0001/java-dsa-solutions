package dsa;

public final class DsaUtils {

    private DsaUtils() {
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        }
        return false;
    }


    public static void printOneToHundred(int num) {

        int count = 0;

            /*int columns = 10; // Number of columns
            for (int i = 1; i <= columns; i++) { // Iterate through 10 columns
                for (int j = i; j <= num; j += columns) { // Print numbers column-wise
                    System.out.printf("%5d", j); // Formatting for alignment
                }
                System.out.println(); // Move to next line after printing a column
            }*/

        for (int i = 1; i < num; i++) {
            System.out.printf("%4d", i);
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }

        }
    }


}
