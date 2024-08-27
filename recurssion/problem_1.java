import java.util.Scanner;

class PrintName{
    public void  printNtimes(int i,int n ){
        if (i > n){
            return ;
        }
        System.out.println("krishna");
        
        printNtimes(i+1,n);
    }
}


public class problem_1 {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        PrintName pn = new PrintName();
        pn.printNtimes(1,n);
       
    }
}
