// 1175. Prime Arrangements
// Easy
// Topics
// Companies
// Hint
// Return the number of permutations of 1 to n so that prime numbers are at prime indices (1-indexed.)

// (Recall that an integer is prime if and only if it is greater than 1, and cannot be written as a product of two positive integers both smaller than it.)

// Since the answer may be large, return the answer modulo 10^9 + 7.

 

// Example 1:

// Input: n = 5
// Output: 12
// Explanation: For example [1,2,5,4,3] is a valid permutation, but [5,2,3,4,1] is not because the prime number 5 is at index 1.
// Example 2:

// Input: n = 100
// Output: 682289015
 

// Constraints:

// 1 <= n <= 100

||================================================================================================================================================================================================||

class Solution {
    private static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {
        int numPrimes = countPrimes(n);
        int numNonPrimes = n - numPrimes;
        
        long result = factorial(numPrimes) * factorial(numNonPrimes) % MOD;
        return (int) result;
    }

    private int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }

    private long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i % MOD;
        }
        return result;
    }
}
