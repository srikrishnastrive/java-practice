import java.util.Scanner;

class AmstrongNumber{
   public boolean checkAmstrong(int n){
        int length = String.valueOf(n).length();
        int copy = n;
        int sum = 0;

        while(n > 0){
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, length);
            n = n/10;
        }
        if (copy == sum ) return true;
        return false;
   } 
}


public class problem_15 {
     public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        AmstrongNumber fs = new AmstrongNumber();
        boolean ans = fs.checkAmstrong(number);
        System.out.println("the factorial of the number "+ans);
    }
}
