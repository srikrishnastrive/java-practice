import java.util.HashMap;
import java.util.Map;

/**
 * Second highest occurring element
 * Input: arr = [1, 2, 2, 3, 3, 3]
 * Output: 2
 * Explanation: The number 2 appears the second most (2 times) and number 3 appears the most (3 times).
 */
public class problem_4 {
    public int SecondHighestElement(int[] nums) {
        int n = nums.length;
        int maxFreq = 0, secMaxFreq = 0;
        int maxEle = -1, secMaxEle = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            int ele = it.getKey();
            int freq = it.getValue();

            if (freq > maxFreq) {
                secMaxFreq = maxFreq;
                secMaxEle = maxEle;
                maxFreq = freq;
                maxEle = ele;
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, ele);
            } else if (freq > secMaxFreq) {
                secMaxFreq = freq;
                secMaxEle = ele;
            } else if (freq == secMaxFreq) {
                secMaxEle = Math.min(secMaxEle, ele);
            }
        }

        return secMaxEle;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 2};
        problem_4 sH = new problem_4();
        int ans = sH.SecondHighestElement(arr);
        System.out.println("The second highest frequency number is " + ans);
    }
}
