import java.util.Scanner;

/**
 * Check for prime number
You are given an integer n. You need to check if the number is prime or not. Return true if it is a prime number, otherwise return false.
A prime number is a number which has no divisors except 1 and itself.
Example 1
Input: n = 5
Output: true

Explanation: The only divisors of 5 are 1 and 5 , So the number 5 is prime.
 */


class PrimeNumber{
    public boolean isPrime(int n){
        if (n <= 1) return false;
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count += 1;
            }
        }
        if(count == 2) return true;
        return false;
    }
}
public class problem_17 {
    public static void main(String[] args){
    
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PrimeNumber pn = new  PrimeNumber();
        boolean ans = pn.isPrime(number);
        System.out.println("the give number prime is "+ans);

    }
}
