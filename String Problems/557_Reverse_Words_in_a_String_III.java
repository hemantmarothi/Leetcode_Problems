// 557. Reverse Words in a String III
// Solved
// Easy
// Topics
// Companies
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "Mr Ding"
// Output: "rM gniD"
 

// Constraints:

// 1 <= s.length <= 5 * 104
// s contains printable ASCII characters.
// s does not contain any leading or trailing spaces.
// There is at least one word in s.
// All the words in s are separated by a single space.

||=======================================================================================================================================================================================================||

class Solution {
    public String reverseWords(String s) {
        // Split the input string by spaces to get individual words
        String[] words = s.split(" ");
        
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word, reverse it, and append to result
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        
        // Remove the last added space and return the result
        return result.toString().trim();
    }
}
