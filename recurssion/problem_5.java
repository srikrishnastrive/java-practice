import java.util.Scanner;

class PrintNumberNto1{
    public void backtrackNto1(int i,int n){
        if (n < i ){
            return;
        }
        backtrackNto1(i + 1, n);
        System.out.println(n-i);
    }   
}

public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNumberNto1 pn = new PrintNumberNto1();
        pn.backtrackNto1(0,n);
        sc.close();
    }
}
