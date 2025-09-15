package dsa.leetcode;

public class ValidAnagram {
    public static void main(String[] args) {
        /** anagram means two string is same as both have same length  and same letters no metter what is order.*/
        String str1 = "anagram";
        String str2 = "ramagna";
        boolean validAnagram = isValidAnagram(str1, str2);
        System.out.println(validAnagram);
    }

    private static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {

            for (int j = 0; j <t.length() ; j++) {

                if (s.charAt(i) == t.charAt(j)){

                }
            }

        }
        return  true;
    }
}
