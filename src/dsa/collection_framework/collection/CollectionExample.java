package dsa.collection_framework.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionExample {

    public static void main(String[] args) {


        /** The Collection interface is the root of the collection framework.
         *  It defines basic operations that every collection(list,set,Queue) must support.
         *
         *  Methods in Collection interface:
         *
         *  1) add() --> Adds the given element to the collection.
         *  2) addAll()--> add all elements from another collection.
         *  3) clear()--> remove all the element from the collection.
         *  4) contains()--> checks if the collection has the given element.
         *  5) containsAll()--> checks if all elements of another collection exists.
         *  6) equals()--> Compares two collections for equality
         *  7) hashCode()--> returns a hash value to the collection.
         *  8) isEmpty()--> checks if collection has no element.
         *  9) iterator()--> returns an iterator for looping/ traverse collection
         *  10) remove()-->Removes one occurrence of the given element.
         *  11) removeAll()--> Removes all elements present in another collection.
         *  12)retainAll()--> keeps only elements present in another collection.
         *  13)size()--> Returns number of elements / count of element.
         *  14)toArray()--> Converts collection to array.
         *
         *
         *  */

        Collection<String> fruits = new ArrayList<>();

        /** insert element into list*/
        fruits.add("mango");
        fruits.add("banana");

        /** Bulk insertion*/
        Collection moreFruits = Arrays.asList("Orange", "Papaya", "PineApple", "Water melon");
        fruits.addAll(moreFruits);

        /** Reset / empty the collection*/
        fruits.clear();

        /** checks if the collection has the given element*/
        if (moreFruits.contains("Orange")) {
            System.out.println("Orange is available in the store.");
        } else {
            System.out.println("Orange is not available in the store");
        }

        /** containsAll() for bulk search*/
        Collection<String> checkList = Arrays.asList("Orange", "Papaya", "Guava", "PineApple", "Lemon");

        if (moreFruits.containsAll(checkList)) {

            System.out.println("Stocks are available");

        } else {
            Collection<String> fruitOutOfStock = new ArrayList<>();

            for (String fruit : checkList) {

                if (!moreFruits.contains(fruit)) {
                    fruitOutOfStock.add(fruit);
                }
            }

            System.out.println("Stocks are not available: " + fruitOutOfStock);
        }

        /** equals() methods checks equality between two list*/

        Collection<String> studentList1 = Arrays.asList("Ram", "Shayam", "laxman");
        Collection<String> studentList2 = Arrays.asList("Ram", "Shayam", "laxman");
        System.out.println(studentList1.equals(studentList2));

        /** hashCode() method returns hash value the collection*/
        System.out.println("Hash value for the collection: " + studentList1.hashCode());

        /** isEmpty() method checks emptiness of the list*/
        System.out.println("Given collection is empty: " + studentList1.isEmpty());

        /** iterator() methods used for traversing list*/

        Iterator<String> iterator = studentList1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /** remove and removeAll() method*/
        Collection<Integer> marks =new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println("Before remove element: "+  marks);
        marks.remove(1);
        System.out.println("After remove list : "+marks);

        marks.removeAll(Arrays.asList(1,2,3)); // remove all element except 4
        System.out.println(marks);

        /** retainAll*/

        Collection<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collection<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,8,9,0));

        list1.retainAll(list2);
        System.out.println(list1);
        /** size() to count the number of element*/
        System.out.println(list1.size());


        /*toArray convert list into array*/
        Integer[] arr = list2.toArray(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" ");

        }


    }
}
