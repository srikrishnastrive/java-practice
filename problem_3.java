
class Pattern1{
    public void printPattern(int n){
        for (int i = 0; i < n ; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
}

public class problem_3 {
    public static void main(String[] args){
        int n = 5;
        Pattern1 p = new Pattern1();
        p.printPattern(n);
    }
}
