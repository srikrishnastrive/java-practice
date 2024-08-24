class Solution {
    public void pattern10(int n) {
       for (int i = 1 ; i <= 2*n-1; i++){
        //it is for rows;
        int stars = i;
        if(i > n) stars = 2*n-i;

        //first half
        for (int j = 1; j <= stars; j++){

            System.out.print("*");
        }
        System.out.println();
       }
    }
}


public class problem_10 {
    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();
}
}
