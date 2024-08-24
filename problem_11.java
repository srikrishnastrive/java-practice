
class Solution11{
    public int countDigit(int n){
        if(n ==0 ) {return 1;} 
        int count = 0;
        while(n > 0){
            int lastDigit = n % 10;
            count = count + 1;
            n = n /10;
        }
        return count;

       
    }
}


public class problem_11 {
    public static void main(String[] args){
        int n = 123;
        Solution11 s = new Solution11();
       
        System.out.println("the count of the digit is"+ s.countDigit(n));

    }
}
