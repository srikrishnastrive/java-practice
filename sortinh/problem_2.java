/**
 * Given an array of integers called nums,sort the array in non-decreasing
 *  order using the bubble sort algorithm and return the sorted array.
A sorted array in non-decreasing order is an array where each element is greater than or
 equal to all preceding elements in the array.
Example 1
Input: nums = [7, 4, 1, 5, 3]
Output: [1, 3, 4, 5, 7]
Explanation: 1 <= 3 <= 4 <= 5 <= 7.
Thus the array is sorted in non-decreasing order.
 */


class BubbleSort{
    public  int[] sortedArray(int[] nums){
        for (int i = nums.length - 1; i >= 0; i--  ){
            boolean isSwapped = false;
            for (int j = 0; j <= i - 1; j++){
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return nums;
    }
}

public class problem_2 {
    public static void main(String[] args) {
        int[] arr = {7,5,9,2,8};

        System.out.println("original array");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        BubbleSort ss = new BubbleSort();
        int[] ans = ss.sortedArray(arr);
        System.out.println("after sorted");
        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
