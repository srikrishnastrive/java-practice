import java.util.Scanner;

class printNUmbers{
    public void printNumbersToN(int i ,int n){
      
        if (i > n){
            return ;
        }
        System.out.println(i);
        printNumbersToN(i+1,n);
    }
}

public class problem_2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        printNUmbers Pn = new printNUmbers();
        Pn.printNumbersToN(i,n);
    }
}
