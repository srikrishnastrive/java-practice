/**
 * Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.
The number returned should not have leading zero's. But the given input string may have leading zero.
Example 1
Input : s = "5347"
Output : "5347"
Explanation : The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.
 */
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
