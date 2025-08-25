package dsa.array;

import java.util.Arrays;

public final class ArrayUtils {

    private ArrayUtils() {
    }


    public static void TreverseArray(int[] arr) {
        System.out.println("Traverse an array :");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }

    public static void largestItemOfArray(int[] arr) {
        int largest = Integer.MIN_VALUE; // - infinity
        for (int i = 0; i <arr.length ; i++) {
            if (largest < arr[i])
                largest= arr[i];
        }
        System.out.println("largest of an array: "+ Arrays.toString(arr)+" is: "+largest);
    }

    public static void smallestItemOfArray(int[] arr) {
        int smallest = Integer.MAX_VALUE; // + infinity

    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static int linearSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int searchFood(String[] menue, String food) {

        for (int i = 0; i < menue.length; i++) {
            if (menue[i].equals(food)) {
                return i;
            }

        }
        return -1;
    }

    public static int binarySearch(int[] sortedArray, int key) {

        // initialize start and end point
        int start = 0, end = sortedArray.length - 1;

        while (start <= end) {

            // calculate mid
            int mid = (start + end) / 2;
            // comparison
            if (sortedArray[mid] == key) {
                return mid;
            }
            if (sortedArray[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void pairsAnArray(int[] sortedArray) {
        int totalPair = 0;
        /** we will use nested loop for this problem*/
        // outer loop print each element
        for (int i = 0; i < sortedArray.length; i++) {

            // inner loop print pairs for outer element
            for (int j = i + 1; j < sortedArray.length; j++) {
                System.out.print("(" + sortedArray[i] + "," + sortedArray[j] + ") ,");
                totalPair++;

            }
            System.out.println();
        }
        System.out.println("Total pair :" + totalPair);
    }

    public static void printSubArrays(int[] number) {

        int max_sum = Integer.MIN_VALUE;

        /** first loop for start*/
        for (int i = 0; i < number.length; i++) {
            int start = i;
            /** second loop for end*/
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                /** third loop print the sub array in between start and end*/
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k]+" ");

                    sum +=number[k];

                }
                System.out.print("----sum= "+sum);

                if (max_sum < sum){
                    max_sum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sub array sum: "+max_sum);
    }
}
