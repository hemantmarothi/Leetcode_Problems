// 409. Longest Palindrome
// Solved
// Easy
// Topics
// Companies
// Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
// palindrome
//  that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

 

// Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.
 

// Constraints:

// 1 <= s.length <= 2000
// s consists of lowercase and/or uppercase English letters only.

||=================================================================================================================================================================||

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int sum=0;
        boolean hasOdd = false;
        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0)+1);
        }
        for(int x:count.values()){
            if(x%2==0)sum+=x;
            else{
                sum+=x-1;
                hasOdd=true;
            }
        }
        if(hasOdd==true)return sum+1;
        return sum;
    }
}