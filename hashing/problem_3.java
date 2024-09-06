import java.util.HashMap;
import java.util.Map;

/**
 * Highest occurring element in an array
 * Input: arr = [1, 2, 2, 3, 3, 3]
Output: 3
Explanation: The number 3 appears the most (3 times). It is the most frequent element.
 */


public class problem_3 {
    public int mostFrequentElement(int[] nums){
        int n = nums.length;
        int maxFreq = 0;
        int maxEle = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i], 0)+1);
        }
        for (Map.Entry<Integer,Integer> it: mpp.entrySet()){
            int ele = it.getKey();
            int freq = it.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                maxEle = ele;
            }
            else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        problem_3 Highest = new problem_3();
        int[] nums = {4,4,5,5,6};
        int ans = Highest.mostFrequentElement(nums);
        System.out.println("the highest occuring element is "+ans);
        
    }
}
