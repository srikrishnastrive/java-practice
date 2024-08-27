class Sum{
   public int sumOfArray(int[] nums){
        return sum(nums,0);
   }

   private int sum(int[] nums, int left){
        if(left >= nums.length){
            return 0;
        }
        return nums[left] + sum(nums, left+1);
   }
}

public class problem_11 {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
       
        Sum s = new Sum();
        int ans = s.sumOfArray(nums);
        System.out.println("sum of all elements "+ans);

    }
}
