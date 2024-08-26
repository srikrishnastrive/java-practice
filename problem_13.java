import java.util.Scanner;


class largeDigit{
    public int findLargestDigit(int n){
        if(n == 0){
            return 0;
        }
        int largestDigit = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if(lastDigit > largestDigit){
                largestDigit = lastDigit;
            }
            n = n/10;
            
        }
        return largestDigit;
    }
}
public class problem_13 {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        largeDigit ld = new largeDigit();
        int ans = ld.findLargestDigit(digit);
        System.out.println("the largest digit is "+ ans);
    }    
}
