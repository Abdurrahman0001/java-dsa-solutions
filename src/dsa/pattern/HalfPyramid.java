package dsa.pattern;

public class HalfPyramid {
    public static void main(String[] args) {
        System.out.println("****** Half Pyramid ********");
        int n = 4;
        printHalfPyramid(n);

    }

    private static void printHalfPyramid(int n) {

        for (int line = 1; line <= n; line++) {

            for (int num = 1; num <= line; num++) {
                System.out.print(num + " ");

            }
            System.out.println();

        }
    }
}
