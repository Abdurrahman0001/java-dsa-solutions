package dsa.array;

public class LinearSearchExample {
    public static void main(String[] args) {

        /*
        int[] numbers  ={10,20,30,40,50};
        int target = 300;
        int index = linearSearch(numbers,target);

        if (index != -1){
            System.out.println("Number found at position: "+ index);
        }
        else {
            System.out.println("Number not found!");
        }


    }

    private static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] == target)
                return i;
        }
        return -1;
    }*/

        /** search your friend in classroom*/
        String[] students = {"ram", "shayam", "rahul", "aman", "komal"};
        String search = "aman";
        int index = searchFriend(students, search);

        if (index != -1){
            System.out.println("Your friend is found on location: "+ index);

        }
        else {
            System.out.println("Your friend is not present in the classroom");
        }

    }

    private static int searchFriend(String[] students, String search) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] == search)
                return i;
        }
        return -1;

    }
}

