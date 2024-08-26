import java.util.Scanner;
/**
 * You are given an integer n. You need to check whether the number is a palindrome number or not. Return true if it's a palindrome number, otherwise return false.



A palindrome number is a number which reads the same both left to right and right to left.


Example 1
Input: n = 121

Output: true

Explanation: When read from left to right : 121.

When read from right to left : 121.
 */

class reverseNumber {
    public int reverse(int n){
        if (n == 0){
            return 0;
        }
        int reverse = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverse = (reverse * 10)+lastDigit;
            n = n/10;
        }
        return reverse;
    }
}
public class problem_12 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverseNumber rN = new reverseNumber();
        int ans = rN.reverse(number);
        System.out.println("the reverse number is "+ans);

    }
}
