/***
 * Second Largest Element
Given an array of integers nums, return the second-largest element in the array.
 If the second-largest element does not exist, return -1.
Example 1
Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation: The largest value in nums is 8, the second largest is 7
 */

 class SecondEle {
    public int SecondLargestElement(int[] nums){
        if(nums.length < 2){
            return -1;
        }
        int largest_element = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > largest_element){
                second_largest = largest_element;
                largest_element = nums[i];
            }
            else if(nums[i] != largest_element && nums[i] > second_largest){
                second_largest = nums[i];
            }
        }
        return second_largest == Integer.MIN_VALUE ? -1 :  second_largest;
    }
    public int SecondSmallestElement(int[] nums) {
        if (nums.length < 2) {
            return -1;
        }
        int smallest_element = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest_element) {
                second_smallest = smallest_element;
                smallest_element = nums[i];
            } else if (nums[i] != smallest_element && nums[i] < second_smallest) {
                second_smallest = nums[i];
            }
        }
    
        // If the second_smallest hasn't been updated, return -1
        return (second_smallest == Integer.MAX_VALUE) ? -1 : second_smallest;
    }
 }

 public class problem_1{
    public static void main(String[] args) {
        int[] nums = {8,8,7,6,5};
        SecondEle se = new SecondEle();
        int secondElement = se.SecondLargestElement(nums);
        System.out.println(secondElement);
        int secondSmallestEle = se.SecondSmallestElement(nums);
        System.out.println(secondSmallestEle);

    }
 }
