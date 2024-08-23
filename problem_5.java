/**
    *****
    ****
    ***
    **
    *
 */

class Pattern3{
    public void printPattern(int n){
        for (int i = 0; i <= n ; i++){
            for (int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
}

public class problem_5 {
    public static void main(String[] args){
        int n = 5;
        Pattern3 p = new Pattern3();
        p.printPattern(n);
    }
}
