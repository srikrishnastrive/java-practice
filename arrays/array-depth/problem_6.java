
/*
 * Find missing number
100 points


65

Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.


Example 1
Input: nums = [0, 2, 3, 1, 4]

Output: 5

Explanation: nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
 */

class Missing{
    public int missingNumber(int[] nums){
        int xor1 =0, xor2 = 0;
        for (int i = 0; i < nums.length; i++){
            xor1 = xor1 ^(i+1);
            xor2 = xor2 ^ nums[i];
        }
        return (xor1 ^ xor2);
    }
}

public class problem_6 {
    public static void main(String[] args) {
        // Example array with missing number
        int[] nums = {0,1, 2, 4};
        
        // Create an instance of the Solution class
        Missing missing = new Missing();
        
        // Call the missingNumber method to find the missing number
        int ans = missing.missingNumber(nums);
        
        // Output the missing number
        System.out.println("The missing number is: " + ans);
    }
}

