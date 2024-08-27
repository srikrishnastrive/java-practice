
class OddNumber{
    public String LargestOddNumber(String s){
        int ind = -1;
        int i;
        for(i = s.length()-1; i >= 0; i--){
            if((s.charAt(i) - '0') % 2 == 1){
                ind = i;
                break;
            }
        }
        if(ind == -1) return "";
        i =0;
        while (i <= ind && s.charAt(i) == '0') {
            i++;
        }
        return s.substring(i, ind+1);
    }
}

public class problem_3 {
    public static void main(String[] args) {
        String s = "0032574";
        OddNumber on = new OddNumber();
        String ans = on.LargestOddNumber(s);
        System.out.println(ans);

    }
}
