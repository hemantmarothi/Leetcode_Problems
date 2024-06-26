// 204. Count Primes
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer n, return the number of prime numbers that are strictly less than n.

 

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// Example 2:

// Input: n = 0
// Output: 0
// Example 3:

// Input: n = 1
// Output: 0
 

// Constraints:

// 0 <= n <= 5 * 106

//||==================================================================================================================================================================||

class Solution {
    public int countPrimes(int n) {
        int[] array = new int[n];
        int count=0;
        Arrays.fill(array, 1);
        if(n<=2)return 0;
        array[0]=0;
        array[1]=0;
        for(int i=2; i<n; i++){
            if(array[i]==1){
                count++;
                for(int j=i+i; j<n; j+=i){
                    array[j]=0;
                }
            }
        }
        return count;
    }
}