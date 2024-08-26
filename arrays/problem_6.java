class SortArray {
    public boolean arraySortedOrNot(int[] arr,int n){
        
        for (int i = 0; i <= n-1; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] > arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}


public class problem_6 {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        int n = arr.length;
        SortArray sa = new SortArray();
        boolean ans = sa.arraySortedOrNot(arr, n);
        if (ans){
            System.out.println("Array is sorted");

        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
