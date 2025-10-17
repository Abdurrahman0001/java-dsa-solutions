package dsa.collection_framework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListBasics {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();

        number.add(59);
        number.add(22);
        number.add(10);
        System.out.println("Before sorting list");
        System.out.println(number);
        /** sort number in ascending order*/
        Collections.sort(number);
        System.out.println("After sorting");
        System.out.println(number);

        /** Find the min value*/
        System.out.println("min value :"+Collections.min(number));
        System.out.println("max value: "+Collections.max(number));
        Collections.shuffle(number);
        System.out.println("shuffle number: "+number);

    }
}
