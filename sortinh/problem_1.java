/**
 * Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.
selection sort


A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.
Example 1
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.
 */

class selectionSort {
    public  int[] sortedArray (int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
        return nums;
    }
}


public class problem_1{
    public static void main(String[] args) {
        int[] arr = {7,5,9,2,8};

        System.out.println("original array");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        selectionSort ss = new selectionSort();
        int[] ans = ss.sortedArray(arr);
        System.out.println("after sorted");
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
