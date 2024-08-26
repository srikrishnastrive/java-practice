

public class problem_5 {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int n = 5;
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--){
            ans[n-i-1] = arr[i];
        }
        for (int i = 0; i < n; i++){
            System.out.print(ans[i]);
        }
    }
}
