
//the doubly linked list reverse 
class Node{
    int data;
    Node next;
    Node back;
    

    Node(int data1,Node next1,Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1){
        this.data = data1;
    }
}


public class problem_3 {

    public static Node createDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node reverseLL(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node last = null;
        Node current = head;
        while (current != null) {
            last = current.back;
            current.back = current.next;
            current.next = last;
            current = current.back;
            
        }
        return last.back;
    }

    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; 
        }
        System.out.println();
       
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        Node head = createDLL(arr);
        System.out.println("Doubly linked list before operations");
        print(head);
        System.out.println("Doubly linked list after reverse of linled list");
        head = reverseLL(head);
        print(head);
    }
}
