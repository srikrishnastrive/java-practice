import java.util.Set;
import java.util.TreeSet;

/**
 * Remove duplicates from sorted array
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. Return the number of unique elements in the array.
If the number of unique elements be k, then,
Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness.
An array sorted in non-decreasing order is an array where every element to the right of an element in either equal to or greater in value than that element.
Example 1
Input: nums = [0, 0, 3, 3, 5, 6]

Output: [0, 3, 5, 6, _, _]

Explanation: There are 4 distinct elements in nums and the elements marked as _ can have any value.
 */


class Duplicates {
    public int removeDuplicates(int[] nums){
        Set<Integer> s = new TreeSet<>();
        for (int val : nums){
            s.add(val);
        }

        int k = s.size();
        int j = 0;

        for (int val : s){
            nums[j++] = val;
        }

        return k;
    }

    public int removeDuplicatesOp(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i +1;
    }
}
public class problem_4 {
   
    public static void main(String[] args) {
        int[] nums = {-2, 2, 4, 4, 4, 4, 5, 5};

        Duplicates ds = new Duplicates();

        // First function: Using TreeSet
        int solution = ds.removeDuplicates(nums);
        System.out.println("TreeSet method result:");
        for (int i = 0; i < solution; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // Second function: Optimized in-place solution
        int op = ds.removeDuplicatesOp(nums);
        System.out.println("Optimized method result:");
        for (int i = 0; i < op; i++) { // Only print up to the number of unique elements
            System.out.print(nums[i] + " ");
        }
    }
}
