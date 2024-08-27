import java.util.Scanner;

//print sum of first N number using recursion

class sumOfN{
    public void printSum(int i,int sum){
        if(i < 1){
            System.out.println(sum);
            return ;
        }
        printSum(i -1,sum+i);
    }   
}

public class problem_6 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sumOfN Sn = new sumOfN();
      Sn.printSum(n, 0);
      sc.close();
    
   } 
}
