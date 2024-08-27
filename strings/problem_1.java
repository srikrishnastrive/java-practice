import java.util.Vector;


class Reverse{
    public Vector<Character> reverseStr(Vector<Character> s){
        int i = 0;
        int j = s.size()-1;
        while (i < j) {
            char temp = s.get(i);
            s.set(i,s.get(j));
            s.set(j,temp);
            i++;
            j--;
        }
        return s;
    }
}
public class problem_1{
    public static void main(String[] args) {
        Vector<Character> str = new Vector<>();
        str.add('h');
        str.add('e');
        str.add('l');
        str.add('l');
        str.add('o');
        Reverse rs = new Reverse();
        Vector<Character> reversedStr = rs.reverseStr(str);
        for (char c: reversedStr){
            System.out.print(c);
        }
       

    }
    
}
