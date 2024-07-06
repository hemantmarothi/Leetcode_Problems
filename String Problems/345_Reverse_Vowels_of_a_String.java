// 345. Reverse Vowels of a String
// Solved
// Easy
// Topics
// Companies
// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

// Example 1:

// Input: s = "hello"
// Output: "holle"
// Example 2:

// Input: s = "leetcode"
// Output: "leotcede"
 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.

||==================================================================================================================================================================================||

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        // Define a set of vowels for quick lookup
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        // Convert the string to a character array for easy manipulation
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        // Use two pointers to find and swap vowels
        while (left < right) {
            // Move the left pointer until a vowel is found
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }
            // Move the right pointer until a vowel is found
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }
            // Swap the vowels
            if (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Convert the character array back to a string and return
        return new String(arr);
    }
}
