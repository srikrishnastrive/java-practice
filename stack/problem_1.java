import java.util.Arrays;
import java.util.List;

class ArrayStack{

    private int[] stackArray;
    private int capacity;
    private int topIndex;

    //constrtuctor 
    public ArrayStack(int size){
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    public ArrayStack(){
        this(1000);
    }
    public void push(int x){
        if(topIndex >= capacity -1){
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    public int top(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return stackArray[topIndex]; 
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        List<String> commands = Arrays.asList("ArraayStack","push","push","top","pop","isEmpty");
        List<List<Integer>> inputs = Arrays.asList(Arrays.asList(),Arrays.asList(5),Arrays.asList(10),Arrays.asList(),Arrays.asList(),Arrays.asList());

        for (int i = 0; i < commands.size(); i++){
            switch (commands.get(i)){
                case "push":
                    stack.push(inputs.get(i).get(0));
                    System.out.println("null ");
                    break;
                case "pop":
                    System.out.println(stack.pop()+" ");
                    break;
                case "top":
                    System.out.println(stack.top()+" ");
                    break;
                case "isEmpty":
                    System.out.println((stack.isEmpty() ? true : false));
                    break;
                case "ArrayStack":
                    System.out.println("null");
                    break;
            
            }
        }
    } 
}
