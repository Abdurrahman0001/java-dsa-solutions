package dsa.array;

public class ArrayPractice {

    public static void main(String[] args) {
/*
        int[] arr = {20, 343, 43, 43, 2, 1, 500};
        String menue[] = {"pasta", "chawmin", "pizza", "burger"};
        int sortedArray[] = {2,4,6,8,10};
        int key = 1000;*/


        /*

         *//** Traverse Array element*//*
        // ArrayUtils.TreverseArray(arr);

        *//** Find the largest element of array*//*
        // ArrayUtils.largestItemOfArray(arr);

        *//** Find the smallest element of array*//*
        // ArrayUtils.smallestItemOfArray(arr);

        *//** Reverse an Array*//*
         *//*ArrayUtils.reverseArray(arr); // array is a call by reference so if any update by method ,it will reflect in the main array

        System.out.println("reverse array");
        for (int num : arr){
            System.out.print(num+" ");
        }*//*
        // System.out.println("\nLength of array: "+arr.length);

        *//** Linear search --- search a particular key in the given array *//*

        int index = ArrayUtils.linearSearch(arr, 500);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("key at index: " + index);
        }

        */
        /** search food in menue*/
        /*
        int foodIndex = ArrayUtils.searchFood(menue, "pasta");
        if (foodIndex == -1) {
            System.out.println("Give some time to make your: "+"pizza");
        } else {
            System.out.println("Take your :" + menue[foodIndex]);
        }

        */

       /* ArrayUtils.largestItemOfArray(arr);
        System.out.println("Index for key is: " + ArrayUtils.binarySearch(sortedArray, key));
        ArrayUtils.reverseArray(sortedArray);
        for (int i = 0; i < sortedArray.length ; i++) {
            System.out.print(sortedArray[i]+" ");
        }*/
/*
        System.out.println("Pairs in an array");
        ArrayUtils.pairsAnArray(sortedArray);*/



        int number[]  = {2,4,6,8,10};

        ArrayUtils.printSubArrays(number);


    }


}
