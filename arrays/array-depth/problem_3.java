/**
 * Given an integer array nums, move all the 0's to the end of the array. The relative order of the other elements must remain the same. This must be done in place, without making a copy of the array.


Example 1
Input: nums = [0, 1, 4, 0, 5, 2]

Output: [1, 4, 5, 2, 0, 0]

Explanation: Both the zeroes are moved to the end and the order of the other elements stay the same
 */

 class Zeros{
    //tc-0(2Xn)
    //sc -0(N)
    public int[] movesZeroToEnd(int[] nums){
        int n = nums.length;
        int[] temp =new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            if(nums[i] != 0){
                temp[count++] = nums[i];
            }
        }
        //copying non zero elments in the array
        for (int i = 0; i< count; i++){
            nums[i] = temp[i];
        }
        //copying the zero elements in the array
        for (int i = count; i < n ; i++){
            nums[i] = 0;
        } 
        return nums;  
    }

    public int[] moveZerosOp(int[] nums){
        int j = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        while (j < n) {
            nums[j++] = 0;
        }
        return nums;
    }
    
 }

public class problem_3 {
    public static void printArray(int[] nums){
        for(int val:nums){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 0, 5, 2};
        Zeros z = new Zeros();
        int[] ans = z.movesZeroToEnd(nums);
        printArray(ans);
        int[] ansP = z.moveZerosOp(nums);
        printArray(ansP);

    }
}
