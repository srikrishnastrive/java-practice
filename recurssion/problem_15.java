/**
 * Check if string is palindrome or not
Given a string s, return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.
Example 1
Input : s = "hannah"
Output : true
Explanation : The string when reversed is --> "hannah", which is same as original string , so we return true.
 */


class Palindrome{
    public boolean PalindromeCheck(String s){
        return reverse(s,0,s.length()-1);
    }
    public boolean reverse(String s,int left,int right){
        if(left >= right){
            return true;
        }

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return reverse(s, left+1, right-1);
    }
}

public class problem_15 {
    public static void main(String[] args) {
        Palindrome pd = new Palindrome();
        System.out.println(pd.PalindromeCheck("aba"));
    }
}
