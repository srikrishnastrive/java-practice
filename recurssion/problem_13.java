import java.util.ArrayList;
import java.util.List;

class sortedArray{
    public boolean isSorted(ArrayList<Integer> nums){
        if (nums.size() <= 1){
            return true;
        }
        return sort(nums,0,1);
    }

    private boolean sort(ArrayList<Integer> nums, int left, int right){
        if(right >= nums.size()){
            return true;
        }
        if(nums.get(left) > nums.get(right)){
            return false;
        }

        return sort(nums, left+1, right+1);
    }
}

public class problem_13 {
    public static void main(String[] args) {
        sortedArray sa = new sortedArray();
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,6,3,4,5));
        boolean result = sa.isSorted(nums);
        System.out.println(result);
    }
}
