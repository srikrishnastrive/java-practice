
/**
 *  1
    12
    123
    1234
    12345
 */


class Pattern2{
    public void printPattern(int n){
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        
        }
    }
}

public class problem_4 {
    public static void main(String[] args){
        int n = 5;
        Pattern2 p = new Pattern2();
        p.printPattern(n);
    }
}
