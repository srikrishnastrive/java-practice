// Given an input string as an array of characters, write a function that reverses the string.
// Example 1
// Input : s = ["h", "e", "l", "l", "o"]

// Output : ["o", "l", "l", "e", "h"]

// Explanation : The given string is s = "hello" and after reversing it becomes s = "olleh".

import java.util.Vector;

class reverseString{

    public void reverse(Vector<Character> s,int left,int right){
        if (left >= right){
            return;
        }
        char temp = s.get(left);
        s.set(left,s.get(right));
        s.set(right,temp);
         reverse(s,left+1, right -1);
    }
    public Vector<Character> reverseStr(Vector<Character> s){
        int left = 0;
        int right = s.size() -1;
        reverse(s,left,right);
        return s;
    }
}

public class problem_14 {
    public static void main(String[] args) {
        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        reverseString rS= new reverseString();
        Vector<Character> reversed = rS.reverseStr(s);
        System.out.println(reversed);

    }
}
