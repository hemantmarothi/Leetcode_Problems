// 405. Convert a Number to Hexadecimal
// Solved
// Easy
// Topics
// Companies
// Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

// All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

// Note: You are not allowed to use any built-in library method to directly solve this problem.

 

// Example 1:

// Input: num = 26
// Output: "1a"
// Example 2:

// Input: num = -1
// Output: "ffffffff"
 

// Constraints:

// -231 <= num <= 231 - 1

||==================================================================================================================================================================================||

class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder hexString = new StringBuilder();

        // Use a mask of 0xF (which is 15 in decimal) to get the last 4 bits
        while (num != 0 && hexString.length() < 8) { // length < 8 to avoid infinite loop on negative numbers
            int hexDigit = num & 0xF;
            hexString.append(hexChars[hexDigit]);
            num >>>= 4; // logical shift right by 4 bits
        }

        return hexString.reverse().toString();
    }
}
