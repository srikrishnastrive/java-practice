import java.util.HashMap;

/**
 * Sum of highest and lowest frequency
 * Example 1
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 4
Explanation: The highest frequency is 3 (element 3), and the lowest frequency is 1 (element 1). Their sum is 3 + 1 = 4.
 */

public class problem_5 {

    public int SumofHighandLow(int[] nums){
        int n = nums.length;
        int minFreq = n, maxFreq = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        
        for (int i = 0; i < n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        
        for (int freq : mpp.values()){
           maxFreq = Math.max(freq, maxFreq);
           minFreq = Math.min(freq, minFreq);

            
        }
        return maxFreq + minFreq;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        problem_5 Sh = new problem_5();
        int ans = Sh.SumofHighandLow(arr);
        System.out.println("the sum of highest and lowest frequency "+ans);

    }
}
