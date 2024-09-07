
//delete the head of the linked list

class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}
public class problem_4 {

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node deleteHeadofLL(Node head){
        if(head == null) return head;
        //java garabage collector automatically deletes the head
        Node temp = head;
        head = head.next;
        return head;
    }

    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        Node head = convertArr2LL(arr);
        Node temp = head;
       
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println("Linked list before deletion");
        System.out.println("Linked List after deletion");
        head = deleteHeadofLL(head);
        print(head);
        // temp = head;
        // while (temp != null) {
        //     System.out.print(temp.data + " ");
        //     temp = temp.next;
            
        // }
        

    }
}
