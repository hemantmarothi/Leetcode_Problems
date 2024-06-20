// 179. Largest Number
// Medium
// Topics
// Companies
// Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

// Since the result may be very large, so you need to return a string instead of an integer.

 

// Example 1:

// Input: nums = [10,2]
// Output: "210"
// Example 2:

// Input: nums = [3,30,34,5,9]
// Output: "9534330"
 

// Constraints:

// 1 <= nums.length <= 100
// 0 <= nums[i] <= 109

||======================================================================================================================================================================||

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }
        
        // Custom comparator
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Reverse order to get descending sort
            }
        };
        
        // Sort using the custom comparator
        Arrays.sort(numsStr, customComparator);
        
        // Edge case: if the largest number is "0", return "0"
        if (numsStr[0].equals("0")) {
            return "0";
        }
        
        // Concatenate sorted strings to form the largest number
        StringBuilder sb = new StringBuilder();
        for (String num : numsStr) {
            sb.append(num);
        }
        
        return sb.toString();
    }
}
