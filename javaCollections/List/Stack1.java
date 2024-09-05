package List;
import java.util.*;


public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
