class Recursion {
    public int recursionN(int count) {
        if (count == 4) {
            return count;
        }
        System.out.println(count);
        count++;
        return recursionN(count);  
    }
}

public class Basic_1 {
    public static void main(String[] args) {
        int count = 0;
        Recursion rc = new Recursion();
        int ans = rc.recursionN(count);
        System.out.println("Final count: " + ans);  
    }
}
