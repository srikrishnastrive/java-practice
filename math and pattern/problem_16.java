import java.util.Scanner;

/**
 * You are given an integer n. You need to check if the number is a perfect number or not. Return true is it is a perfect number, otherwise return false.



A perfect number is a number whose proper divisors add up to the number itself.


Example 1
Input: n = 6

Output: true

Explanation: Proper divisors of 6 are 1, 2, 3.

1 + 2 + 3 = 6.
 */
class PerfectNumber{
    public boolean checkPerfectNumber(int n){
        int copy = n;
        int sum = 0;
        for (int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if (sum == copy) return true;
        return false;
    }
}

public class problem_16 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        PerfectNumber pN = new PerfectNumber();
        boolean ans = pN.checkPerfectNumber(number);
        System.out.println("the perfect number is "+ans);

    }
    
}   
