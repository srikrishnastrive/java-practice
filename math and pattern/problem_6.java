
/**
 *  12345
    1234
    123
    12
    1

 */
class Pattern4{
    public void printPattern(int n){
        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= (n+1) - i; j++){
                System.out.print(j);
            }
            System.out.println();
        
        }
    }
}

public class problem_6 {
    public static void main(String[] args){
        int n = 5;
        Pattern4 p = new Pattern4();
        p.printPattern(n);
    }
}
