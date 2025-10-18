package dsa.collection_framework.list;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        /** Que1--> Create and print an ArrayList()*/

        List<String> name = new ArrayList<>();
        name.add("Abdur Rahman");
        name.add("Saif");
        name.add("Hamid");
        name.add("Faiz");
        System.out.println(name);

        /*Access element from an arraylist*/

        System.out.println(name.get(0)); // access by indes - Abdur Rahman

        /*Access first element from the list*/
        System.out.println(name.getFirst());

        /*Access last element form the list*/
        System.out.println(name.getLast());

        /*Update particular element from the list*/
        name.set(0, "Shahid");
        System.out.println(name);

        /*Remove particular element from the list*/
        name.remove(0);  // remove by index
        System.out.println(name);
        name.remove("Hamid");  // remove by object
        System.out.println(name);

        /** iterate ArrayList using for-each-loop*/

        List<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Maruti");
        cars.add("Audi");
        cars.add("BMW");

        for (String car : cars) {
            System.out.println(car);
        }

        /*===================================LinkedList as List========================================================*/

        List<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Gurugram");
        System.out.println(cities);

        /*Extra methods*/
        cities.addFirst("Bihar");
        cities.addLast("Haryana");
        System.out.println(cities);

        // ==========Vector Example ===========================

        Vector<Integer> v  = new Vector<>();
        v.add(23);
        v.add(43);
        System.out.println(v);

        // ============== Stack Example ================

        Stack<String> stack = new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop()); // remove and return the item
        System.out.println(stack);

        /** Sorting a list*/
        List<Integer> nums = new ArrayList<>(Arrays.asList(34,2,5,1));

        Collections.sort(nums);
        System.out.println(nums);

        /** Searching in a list*/
        if (nums.contains(5)){
            System.out.println("Number found!");
        }



    }
}
