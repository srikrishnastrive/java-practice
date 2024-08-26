//Print last character of string
/**
 * Input : s = "takeuforward"
Output : d
Explanation : The last character of given string is "d".
 */




class LastChar{
    public char findLastChar(String message){
        return message.charAt(message.length() -1);
    }
}


public class problem_1 {
    public static void main(String[] args){
        String message = "takeuforward";
        LastChar lc = new LastChar();
        System.out.println("the last char of the message  "+lc.findLastChar(message));
       
    }
}
