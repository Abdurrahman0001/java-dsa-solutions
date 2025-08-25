package dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static void main(String[] args) {
        /*int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        int target = 60;

        int index = binarySearch(numbers, target);

        if (index != -1){
            System.out.println("target is found at position: "+ index);
        }
        else {
            System.out.println("target not found!");
        }*/

        // Step 1: Sorted list of book titles
        String[] libraryBooks = {
                "Algebra", "Biology", "Chemistry", "English", "Geography",
                "History", "Math", "Physics", "Science", "Zoology"
        };

        // Step 2: Input the book title to search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book title you want to search: ");
        String bookToFind = sc.nextLine();

        // Step 3: Perform binary search
        int index = binarySearch(libraryBooks, bookToFind);

        // Step 4: Show result
        if (index == -1) {
            System.out.println("❌ Book not found in the library.");
        } else {
            System.out.println("✅ Book '" + bookToFind + "' found at position: " + index);
        }
    }

    // Binary Search for String Array
    public static int binarySearch(String[] arr, String key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Compare ignoring case
            int result = key.compareToIgnoreCase(arr[mid]);
            System.out.println(result);

            if (result == 0) {
                return mid; // Found
            } else if (result < 0) {
                right = mid - 1; // Go to left half
            } else {
                left = mid + 1; // Go to right half
            }
        }

        return -1; // Not found
    }
}
