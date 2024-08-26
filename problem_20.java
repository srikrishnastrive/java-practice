

class Lcm {
    public int findLcm(int n1,int n2){
        int lcm;
        int i = 1;
        int n = Math.max(n1,n2);
        while (true) {
            int mul = n * i;
            if(mul % n1 == 0 && mul % n2 == 0){
                lcm = mul;
                break;
            }
            i++;
        }
        return lcm;
    }
}

public class problem_20{
    public static void main(String[] args){
        int n1 = 4, n2 = 6;
        Lcm lc = new Lcm();
        int ans = lc.findLcm(n1, n2);
        System.out.println("the Lcm number is "+ans);
    }   
}
