/**
 * Left Rotate Array by K Places
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
Example 1
Input: nums = [1, 2, 3, 4, 5, 6], k = 2
Output: nums = [3, 4, 5, 6, 1, 2]
Explanation: rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
 */

class Rotate {
    public void reverse(int[] nums,int start,int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void reverseArray(int[] nums,int k){
        int n = nums.length;
        k = k%n;
        reverse(nums,0,k-1);
        reverse(nums, k, n-1);
        reverse(nums, 0, n-1);
    }
}
public class problem_2 {

    public static void printArray(int[] nums){
        for (int val:nums){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
       printArray(nums);
        System.out.println("After rotating");
        Rotate rA = new Rotate();
        rA.reverseArray(nums, k);
        printArray(nums);


        
       

    }
}
