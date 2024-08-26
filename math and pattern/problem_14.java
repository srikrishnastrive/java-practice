import java.util.Scanner;

/**
 * You are given an integer n. Return the value of n! or n factorial.



Factorial of a number is the product of all positive integers less than or equal to that number.


Example 1
Input: n = 2

Output: 2

Explanation: 2! = 1 * 2 = 2.


 */

 class Factorial{
    public int factorialOfNumber(int n){
        if(n == 0 ){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
 }

public class problem_14 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        Factorial fs = new Factorial();
        int ans = fs.factorialOfNumber(factorial);
        System.out.println("the factorial of the number "+ans);
    }
}
