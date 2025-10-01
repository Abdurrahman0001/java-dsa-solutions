package dsa.array;

public class RemoveDuplicates {

    /*
    * intput. nums = [1,1,2,2,3,3,4]
    *
    * output. uniquelen = 4
    * */

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,5,5};

        int uniqueLen = removeDuplicates(nums);

        System.out.println("New length: "+uniqueLen);
        System.out.println("Modified Array: ");

        for (int i = 0; i < uniqueLen ; i++) {
            System.out.print(nums[uniqueLen]+" ");
        }
    }

    private static int removeDuplicates(int[] nums) {

        // check array is empty
        if (nums.length == 0){
            return 0;
        }

        // use a pointer to track unique value
        int i = 0;

        // travers the array from 2nd element onwards
        for (int j = 1; j <nums.length ; j++) {

            if (nums[j] != nums[i]){
                //move pointer forward
                i++;
                //update with new unique element
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
