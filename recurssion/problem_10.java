// Sum of digits in a given number
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
// Example 1
// Input : num = 529
// Output : 7
// Explanation : In first iteration the digits sum will be = 5 + 2 + 9 => 16
// In second iteration the digits sum will be 1 + 6 => 7.
// Now single digit is remaining , so we return it.

class problem_10 {
    
    public int addDigits(int num){
        if(num < 10){
            return num;
        }
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num = num/10;
        }
        return addDigits(sum);
    }
    public static void main(String[] args){
        problem_10 solution = new problem_10();
        int num = 539;
        int result = solution.addDigits(num);
        System.out.println("sum of digits "+result);
    }
}
