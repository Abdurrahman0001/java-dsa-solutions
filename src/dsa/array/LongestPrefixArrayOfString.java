package dsa.array;

public class LongestPrefixArrayOfString {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String commonPrifix = longestPrefix(str);
        System.out.println(commonPrifix);
    }

    private static String longestPrefix(String[] str) {

        // check null and len
        if (str == null || str.length == 0){
            return "";
        }

        // proceed from here
        // declare firstStr and commonPrefix var
        String firstStr = str[0];
        String commonPrefix = "";

        // outer loop for each character of firstStr
        for (int i = 0; i < firstStr.length(); i++) {

            // save char into char var
            char currentChar = firstStr.charAt(i);

            // inner loop for checking current char into other array of string
            for (int j = 1; j <str.length ; j++) {

                // check here is i exceed or equal form length of string or not equal form current character
                if (i >= str[j].length() || str[j].charAt(i) != currentChar){
                    return commonPrefix;
                }

            }
            commonPrefix += currentChar;

        }
        return commonPrefix;
    }
}
