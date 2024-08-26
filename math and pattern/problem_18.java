// Count of prime numbers till N
// You are given an integer n. You need to find out the number of prime numbers in the range [1, n] (inclusive). Return the number of prime numbers in the range.
// A prime number is a number which has no divisors except, 1 and itself.
// Example 1
// Input: n = 6
// Output: 3
// Explanation: Prime numbers in the range [1, 6] are 2, 3, 5.

import java.util.Scanner;

class PrimeNumbers {
    public boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count = count + 1;
            }
        }
        if(count == 2) return true;
        return false;
    }

    public int primeUptoN(int n){
        int count = 0;
        //0 and 1 are not prime numbers
        for (int i = 2; i <= n; i++){
            if(isPrime(i)) count ++;
        }

        return count;
    }
}

public class problem_18 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PrimeNumbers pn = new PrimeNumbers();
        int ans = pn.primeUptoN(number);
        System.out.println("prime numbers are "+ans);

    }
}
