/**
 *******
  ***** 
   ***  
    *   
 */
class Pattern8{
    public void printPattern(int n){
        for (int i = 0; i < n ; i++){
           //for spaces
           for (int j = 0; j < i;j++){
            System.out.print(" ");
           }
           //for stars
           for (int j = 0; j < 2*n-(2*i+1); j++){
            System.out.print("*");
           }
           System.out.println();
        
        }
    }
}

public class problem_8 {
    public static void main(String[] args){
        int n = 4;
        Pattern8 p = new Pattern8();
        p.printPattern(n);
    }
}
