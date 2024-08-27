
class Palindrome{
    public boolean palindromeCheck(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class problem_2 {
    
    public static void main(String[] args) {
        String str = "abc";
        Palindrome pd = new Palindrome();
        boolean ans = pd.palindromeCheck(str);
        if(ans){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+"is not a palindrome");
        }
    }
}
