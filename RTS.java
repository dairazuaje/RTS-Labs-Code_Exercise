import java.util.*;

public class RTS {

    /**
     * 1.) Print the number of integers in an array that are above the given input and the number that are below, 
     * e.g. for the array [1, 5, 2, 1, 10] with input 6, print 'above: 1, below: 4'
     * Function: Iterate through given array to determine 
     * @param arr - Array that method will iterate through to determine above and below counts against provided target
     * @param target - Value to be checked whether nums in array are above or below
     */
    public static void aboveBelow(int[] arr, int target) {
        
        // Check array length and return if array is empty
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int aboveCount = 0, belowCount = 0; // variables to store results of method
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                aboveCount++;
            } else if (arr[i] < target) {
                belowCount++;
            }
        }

        System.out.println("Above: " + aboveCount + ", Below: " + belowCount);
    }

    /**
     * 2.) Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. 
     * 'MyString' rotated by 2 is 'ngMyStri'
     * Function: Method rotates characters in a string by a given input
     * @param str - String to be rotated
     * @param rotateAmount - Amount to rotate characters in string
     */
    public static void rotateString(char[] str, int rotateAmount) {

        // Check if rotation amount is valid
        if (rotateAmount > str.length || str.length == 0) {
            System.out.println("Rotate amount is larger than string length or string is empty");
            return;
        }
        
        reverse(str, 0, str.length - 1); // Reverse whole string {MyString} -> {gnirtSyM}
        reverse(str, 0, rotateAmount - 1); // Reverse string to get rotated part {gnirtSyM} -> {ngirtSyM}
        reverse(str, rotateAmount, str.length - 1); // Reverse from rotated part to the rest of the string {ngirtSyM} -> {ngMyStri}
        System.out.println(Arrays.toString(str));
    }

    /**
     * 3.) If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?
     * I've been diving into Node.js and Express.js whenever I have some decent free time and have been loving it. I've found it
     * to be more enjoyable than the languages I learned in school and has also help me like JavaScript more. I didn't really like
     * it to begin with. I don't think that I know enough about the frameworks yet to know what I would like to change but I would
     * like if this were something they taught in school. Frameworks are a big part of real world development and they're just 
     * not mentioned in school really. 
     */

    /**
     * Function: Helper function to reverse letters in string
     * @param str - String to be reversed
     * @param statt - Start position of string reversal
     * @param end - End position of string reversal
     */
    public static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        // Question 1 Tests
        int[] nums = {1,5,2,1,10};
        aboveBelow(nums, 1); // Output: Above: 3, Below: 0
        aboveBelow(nums, 2); // Output: Above: 2, Below: 2
        aboveBelow(nums, 3); // Output: Above: 2, Below: 3
        aboveBelow(nums, 4); // Output: Above: 2, Below: 3
        aboveBelow(nums, 5); // Output: Above: 1, Below: 3
        aboveBelow(nums, 6); // Output: Above: 1, Below: 4
        aboveBelow(nums, 7); // Output: Above: 1, Below: 4
        aboveBelow(nums, 8); // Output: Above: 1, Below: 4
        aboveBelow(nums, 9); // Output: Above: 1, Below: 4
        aboveBelow(nums, 10); // Output: Above: 0, Below: 4
        int[] emptyArray = {}; // Output: Array is empty
        aboveBelow(emptyArray, 5);

        // Question 2 Tests
        char[] str0 = {'M','y','S','t','r','i','n','g'}; 
        char[] str1 = {'M','y','S','t','r','i','n','g'};
        char[] str2 = {'M','y','S','t','r','i','n','g'};
        char[] str3 = {'M','y','S','t','r','i','n','g'};
        char[] str4 = {'M','y','S','t','r','i','n','g'};
        char[] str5 = {'M','y','S','t','r','i','n','g'};
        char[] str6 = {'M','y','S','t','r','i','n','g'};
        char[] str7 = {'M','y','S','t','r','i','n','g'};
        char[] str8 = {'M','y','S','t','r','i','n','g'};
        char[] str9 = {'M','y','S','t','r','i','n','g'};
        char[] empty = {};
        rotateString(str0, 0); // Output: MyString
        rotateString(str1, 1); // Output: gMyStrin
        rotateString(str2, 2); // Output: ngMyStri
        rotateString(str3, 3); // Output: ingMyStr
        rotateString(str4, 4); // Output: ringMySt
        rotateString(str5, 5); // Output: tringMyS
        rotateString(str6, 6); // Output: StringMy
        rotateString(str7, 7); // Output: yStringM
        rotateString(str8, 8); // Output: MyString
        rotateString(str9, 9); // Output: Rotate amount is larger than string length or string is empty
        rotateString(empty, 0); // Output: Rotate amount is larger than string length or string is empty
    }
}