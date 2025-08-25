package dsa.array;

public class LargestNumber {
    public static void main(String[] args) {
        int[] marks = {74, 68, 98, 10, 45};
        int largestMarks = largestMarks(marks);
        System.out.println("Largest marks is :"+largestMarks);
    }

    private static int largestMarks(int[] marks) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (largestNum < marks[i])
                largestNum = marks[i];
        }
        return largestNum;

    }
}
