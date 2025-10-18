package dsa.collection_framework.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollcetionsExample {
    public static void main(String[] args) {
        /** Collections ---> The Collections class is utility or helper class with only static methods
         *                   so we don't create object of it.Directly call method using class name.
         *
         *
         * List of Methods in Collections class:
         *
         * 1)sort(pass list)--> Sorts elements in natural orders.like if list is 2,4,2,3 -->2,2,3,4
         * 2)sort(list, comparator)--> sorts with custom comparator.
         *
         *
         * */

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);
        numbers.add(10);
        numbers.add(5);

        System.out.println("Number before sorting: "+numbers);

        /** sort list in natural order*/
        Collections.sort(numbers);
        System.out.println("After sorting the number: "+numbers);

        /**sort with custom object*/
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("List sorted in revers order: "+numbers);

        /** Reverse order of element*/

        List<Integer> marks = new ArrayList<>(Arrays.asList(45,56,75,87,1,2,2,2,2));

        Collections.reverse(marks);
        System.out.println(marks);


        /** randomly shuffles element*/
        Collections.shuffle(marks);
        System.out.println(marks);

        /**min() method returns smallest elements from the list*/
        // in the case of list of marks
        System.out.println("Minimum marks of the list: "+Collections.min(marks));

        /**max() method returns largest elements from the list*/
        // in the case of list of marks
        System.out.println("Maximum marks of the list: "+Collections.max(marks));

        /**frequency()--> Count how many times an elements occurrence,pass list and object that want occurring time*/
        System.out.println("How many times 2 occur in the list: "+Collections.frequency(marks, 2));

        /**replaceAll()--> Replace all occurrences of a value*/
        // Replacing 2 to 98 in the marks list
        Collections.replaceAll(marks,2,98);
        System.out.println("After replacing 2 to 98: "+marks);

        /**synchronizedList(list)--> makes a list synchronizedList means thread-safe(two threads will not access at a time)*/

        List<String>syncList = Collections.synchronizedList(new ArrayList<>());

        /** unmodifiableList(list of objects)-->Returns read only version ,means we can't modify.
         *                                      it returns readOnly list of objects*/

        try {
            List<Integer> readOnlyList = Collections.unmodifiableList(marks);
            readOnlyList.add(5453);    //Error will be thrown in the main method UnsupportedOperationException
            System.out.println(marks);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        /**copy()--> copies elements from one source to another*/
//        List<Integer> destination = new ArrayList<>();
//        Collections.copy(destination, marks);
//        System.out.println(destination);

        /** disjoint(list1, list2)-->checks if two collections have no element in common*/

        System.out.println(Collections.disjoint(marks, Arrays.asList(15)));




    }
}
