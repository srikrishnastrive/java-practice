

class insertionSort {
    public int[] sortedArray(int[] nums){
        for (int i = 1; i < nums.length -1 ;i++){
            int key = nums[i];
            int j = i - 1;
            while (j >=0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;

            }
            nums[j + 1] = key;
        }
        return nums;
    }
}

public class problem_3 {
    public static void main(String[] args) {
        int[] arr = {7,5,9,2,8};

        System.out.println("original array");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSort ss = new insertionSort();
        int[] ans = ss.sortedArray(arr);
        System.out.println("after sorted");
        for (int num : ans){
            System.out.print(num + " ");
        }
    }    
}
