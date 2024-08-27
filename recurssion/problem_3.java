

//print in the terms of n to 1.

import java.util.Scanner;

class PrintNumbers1 {
    public void printNTo1(int n){
        if (n < 1){
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
    }
}

public class problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNumbers1 p1 = new PrintNumbers1();
        p1.printNTo1(n);
        sc.close(); 
    }
}
