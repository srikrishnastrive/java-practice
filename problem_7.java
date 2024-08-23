
/**
 *  12345
    1234
    123
    12
    1

 */
class Pattern7{
    public void printPattern(int n){
        for (int i = 0; i < n ; i++){
           //for spaces
           for (int j = 0; j < n-i-1;j++){
            System.out.print(" ");
           }
           //for stars
           for (int j = 0; j < 2*i+1; j++){
            System.out.print("*");
           }
           System.out.println();
        
        }
    }
}

public class problem_7 {
    public static void main(String[] args){
        int n = 4;
        Pattern7 p = new Pattern7();
        p.printPattern(n);
    }
}
