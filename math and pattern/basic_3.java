import java.util.List;

class Array1Solution{
    public int sumOfFirstandLastIndex(List<Integer> nums){
        if(nums.isEmpty()){
            return 0;
        }
        int first = nums.get(0);
        int last = nums.get(nums.size() -1);
        
        return first + last;

    }
}


public class basic_3 {
    public static void main(String[] args){
        Array1Solution solution = new Array1Solution();
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println("the sum of first and last index :"+solution.sumOfFirstandLastIndex(nums));
    }
}
