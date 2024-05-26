// 217. Contains Duplicate
// Solved
// Easy
// Topics
// Companies
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

||=======================================================================================================================================================================================||

class Solution {
    public boolean containsDuplicate(int[] nums) {
      int len = nums.length;
		
		if ( len == 1 ) return false;
		if ( len == 2 ) return nums[0] == nums[1];
		
		for( int i=1; i<len; i++ ) {
			int currentValue = nums[i];
			int j = i-1;
			int prevValue = nums[j];
			
			if ( currentValue < prevValue  ) {
				while ( true ) {
					nums[j+1] = prevValue;
					if ( j-- == 0 ) break;
					prevValue = nums[j];
					if ( currentValue >= prevValue) break;
				}
				nums[j+1] = currentValue;
			}	
			
			if ( currentValue == prevValue ) return true;
			
		}
		return false;
    }
}