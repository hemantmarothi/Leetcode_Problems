// 136. Single Number
// Solved
// Easy
// Topics
// Companies
// Hint
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]
// Output: 1
// Example 2:

// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:

// Input: nums = [1]
// Output: 1
 

// Constraints:

// 1 <= nums.length <= 3 * 104
// -3 * 104 <= nums[i] <= 3 * 104
// Each element in the array appears twice except for one element which appears only once.

//||=====================================================================================================================================================================||

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int i=0;
        if(size==1)return nums[0];
        for(i=0; i<size-1; i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }if(i>=size-1){
            return nums[size-1];
        }
        return -1;
    }
}



// Another solution can be:-
//||========================================================================================================================================================||

class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i:nums){
            res^=i;
        }
        return res;
    }
}