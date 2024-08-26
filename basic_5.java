import java.util.*;

//Print X N numbers of times
/**
 * Example 1
Input: X = 7, N = 5

Output: 7 7 7 7 7
 */
class PrintXN {
    public void printXNNumbers(int x, int n) {

        if (n < 0){
            System.out.println("Invalid number of times");
            return;
        }
        // Print n numbers starting from x
        for (int i = 0; i < n; i++) {
            System.out.print(x);
            if (i < n-1){
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
   
}

public class basic_5 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number (x): ");
        int x = sc.nextInt();
        System.out.println("Enter the number of numbers to print (n): ");
        int n = sc.nextInt();

        PrintXN xn = new PrintXN();
        xn.printXNNumbers(x, n);
    }
}

