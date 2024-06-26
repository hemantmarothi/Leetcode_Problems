// 441. Arranging Coins
// Easy
// Topics
// Companies
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

// Given the integer n, return the number of complete rows of the staircase you will build.

 

// Example 1:


// Input: n = 5
// Output: 2
// Explanation: Because the 3rd row is incomplete, we return 2.
// Example 2:


// Input: n = 8
// Output: 3
// Explanation: Because the 4th row is incomplete, we return 3.
 

// Constraints:

// 1 <= n <= 231 - 1


||===========================================================================================================================================================================||

class Solution {
    public int arrangeCoins(int n) {
        // Initialize left and right pointers for binary search
        long left = 0, right = n;
        
        // Binary search to find the maximum k such that k * (k + 1) / 2 <= n
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long coinsUsed = mid * (mid + 1) / 2;
            
            if (coinsUsed == n) {
                return (int) mid;
            } else if (coinsUsed < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // The maximum k where k * (k + 1) / 2 <= n is right
        return (int) right;
    }
}
