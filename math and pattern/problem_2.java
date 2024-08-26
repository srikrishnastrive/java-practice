class Pattern{
    public void printPattern(int n){
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        
        }
    }
}

public class problem_2 {
    public static void main(String[] args){
        int n = 5;
        Pattern p = new Pattern();
        p.printPattern(n);
    }
}
