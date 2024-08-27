
class factorial{
    public int findFactorial(int n){
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return n * findFactorial(n-1);
    }
}

public class problem_8 {
    public static void main(String[] args) {
    int N = 5;
    factorial fi = new factorial();
    System.out.println("Sum of first " + N + " numbers is " + fi.findFactorial(N));
    }
    
}
