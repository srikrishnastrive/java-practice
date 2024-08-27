class Solution {
    public int NnumbersSum(int N) {
        // Base case: if N is 0, return 0
        if (N == 0) return 0;
        // Recursive case: add N to the sum of N-1
        return N + NnumbersSum(N - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 10;  
        System.out.println("Sum of first " + N + " numbers is " + solution.NnumbersSum(N));
    }
}
