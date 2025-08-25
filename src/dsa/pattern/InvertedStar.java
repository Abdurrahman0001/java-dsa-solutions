package dsa.pattern;

public class InvertedStar {
    /**
     * Ques : Inverted star pattern
     * Approach :
     * step1: take input line
     * step2: Outer loop -> run line
     * step3: Inner loop -> print line star
     */
    public static void main(String[] args) {
        System.out.println("****** Inverted Star*******");

        int n = 8;

        printInvertedStar(n);

    }

    private static void printInvertedStar(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
