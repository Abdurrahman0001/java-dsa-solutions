package dsa.collection_framework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListImplArrayList {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        /** add element in the list*/
        name.add("Abdur Rahman");
        name.add("Shahid Taufique");

        /*Add another list into base list*/
        List<String> moreName= new ArrayList<>(Arrays.asList("sam","Ram", "Shayam"));
        name.addAll(moreName);
        System.out.println(name);
        System.out.println(name.indexOf("Ram"));
        System.out.println(name.get(1));
    }
}
