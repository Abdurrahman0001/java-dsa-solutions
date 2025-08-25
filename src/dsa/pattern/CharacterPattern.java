package dsa.pattern;

public class CharacterPattern {
    public static void main(String[] args) {
        System.out.println("****** Character Pattern *******");
        int n = 4;
        printCharacterPattern(n);
    }

    private static void printCharacterPattern(int n) {

        char ch = 'A';
        for (int line = 1; line <= n; line++) {

            for (int chr = 1; chr <= line; chr++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
