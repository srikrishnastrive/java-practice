class ReverseElements{
    public int[] reverseArray(int[] nums){
        //helper function to reverse the array.
        reverse(nums,0,nums.length-1);
        return nums;
    }
    private void reverse(int[] nums,int left,int right){
        if (left >= right){
            return;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        reverse(nums, left+1, right-1);
    }
}

public class problem_12 {
    public static void main(String[] args) {
        ReverseElements solution = new ReverseElements();
        int [] nums = {1,2,3,4,5};
        int[] result = solution.reverseArray(nums);
        for (int num:result){
            System.out.print(num + " ");
        }

    }
}
