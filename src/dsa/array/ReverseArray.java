package dsa.array;


public class ReverseArray {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5};
        System.out.println("Before reverse:");
        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        reverseArray(marks);
        System.out.println("After reverse :");
        for (int i = 0; i <marks.length ; i++) {
            System.out.print(marks[i]+" ");

        }
    }

    private static void reverseArray(int[] marks) {
        /** take 2 pointer start and end to track the index*/
        int start =0, end = marks.length - 1;
        while (start < end){
            int temp  = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
    }
}
