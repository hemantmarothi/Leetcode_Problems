// 914. X of a Kind in a Deck of Cards
// Easy
// Topics
// Companies
// You are given an integer array deck where deck[i] represents the number written on the ith card.

// Partition the cards into one or more groups such that:

// Each group has exactly x cards where x > 1, and
// All the cards in one group have the same integer written on them.
// Return true if such partition is possible, or false otherwise.

 

// Example 1:

// Input: deck = [1,2,3,4,4,3,2,1]
// Output: true
// Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
// Example 2:

// Input: deck = [1,1,1,2,2,2,3,3]
// Output: false
// Explanation: No possible partition.
 

// Constraints:

// 1 <= deck.length <= 104
// 0 <= deck[i] < 104

||========================================================================================================================================================||

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        // Step 1: Count frequencies of each card
        Map<Integer, Integer> count = new HashMap<>();
        for (int card : deck) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }
        
        // Step 2: Find the GCD of the frequencies
        int gcd = -1;
        for (int freq : count.values()) {
            if (gcd == -1) {
                gcd = freq;
            } else {
                gcd = gcd(gcd, freq);
            }
        }
        
        // Step 3: Check if GCD is greater than 1
        return gcd > 1;
    }
    
    // Helper method to calculate GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
