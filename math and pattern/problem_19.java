
class Gcd{
    public int gcdNumber(int n1,int n2){
        int gcd = 1;
        for (int i = 1; i< Math.min(n1, n2);i++){
            if (n1 % i == 0 && n2 % i  == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}

public class problem_19 {
    public static void main(String[] args){
        int n1 = 4, n2 = 6;
        Gcd gc = new Gcd();
        int ans = gc.gcdNumber(n1, n2);
        System.out.println("the gcd number is "+ans);


    }
}
