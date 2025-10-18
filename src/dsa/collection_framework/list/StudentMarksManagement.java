package dsa.collection_framework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentMarksManagement {

    public static void main(String[] args) {
        /**
         * Student Marks Management:
         *  Store marks of Student in an ArrayList
         *  Find Highest,Lowest, and average marks of student
         * */

        List<Integer> studentMarks = new ArrayList<>(Arrays.asList(85, 76, 46, 87, 94, 64, 98, 76, 99, 76));

/*        System.out.println("Highest Marks of Student: " + Collections.max(studentMarks));
        System.out.println("Lowest Marks of Student: " + Collections.min(studentMarks));
        System.out.println("Average Marks of Student: " + avgMarks(studentMarks));*/

        int min = Collections.min(studentMarks);
        int max = Collections.max(studentMarks);
        double avg = studentMarks.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Marks: "+studentMarks);
        System.out.println("Highest: "+max);
        System.out.println("Lowest: "+min);
        System.out.println("Average: "+avg);



    }

    private static int avgMarks(List<Integer> studentMarks) {
        int sum = 0;
        int numOfStudent = 0;

        for (int mark : studentMarks) {
            sum += mark;
        }

        numOfStudent = studentMarks.size();

        return sum / numOfStudent;

    }
}
