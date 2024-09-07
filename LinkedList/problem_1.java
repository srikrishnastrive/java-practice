//creating a linked list with an array
class Node{
    int data;
    Node next;
    //Node(int data1, Node next1): This constructor allows you to set both the data and the next node when creating a new node.
    public Node(int data1,Node next1){
        this.data =data1;
        this.next = next1;
    }
    //constructtor
    //Node(int data1): This constructor allows you to set only the data, while next is set to null.
    // This is useful when the node is the last one (or initially the only one) in the list.
    public Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class problem_1 {
    private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,8,7};
        Node head = convertArr2LL(arr);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}
