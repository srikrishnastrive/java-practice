import java.util.Scanner;

class backtrackingPrint{
    public void print(int i, int n){
        if(i < 1){
            return;
        }
        print(i-1,n);
        System.out.println(i);
    }
}

public class problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backtrackingPrint bp = new backtrackingPrint();
        bp.print(n, n);
        sc.close();
    }
}
