import java.util.Arrays;

class Dividend{
    public int[] findDividend(int n){
        int[] temp = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
               
                temp[count++] = i;
            
                
            }
            
        }
        int[] ans = Arrays.copyOf(temp, count);
        return ans;
    }
}

public class problem_21 {
    public static void main(String[] args){
        int n = 6;
        Dividend div = new Dividend();
        int[] ans = div.findDividend(n);
        System.out.println("The divisors of "+ n + "are:");
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
