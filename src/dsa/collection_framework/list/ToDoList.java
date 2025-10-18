package dsa.collection_framework.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class ToDoList {

    public static void main(String[] args) {
        /**
         * To Do List:
         *      Create a linkedList of daily task
         *      Add tast at the beginning (high priority) and end (low priority).
         *      remove complete tast.
         * */

        List<String> task = new LinkedList<>();
        task.addFirst("Practice coding");
        task.add("Learn English");
        task.addLast("Cook Food");
        System.out.println("Tasks: "+task);

        task.remove("Practice coding");
        System.out.println("Remaining: "+ task);

        task.removeAll(task);
        System.out.println(task);


    }
}
