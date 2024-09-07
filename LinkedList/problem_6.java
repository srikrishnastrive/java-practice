

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

public class problem_6 {

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

    public static Node deleteKthNode(Node head,int k){
        if(head == null) return head;
        if(k == 1){
           head = head.next;
           return head;
        }
       
        int count = 0;
        Node temp = head;
        Node prev = null;
        
       
        //if k is not 1 and 3
        while (temp != null) {
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

            
        }
        return head;
        //if k is 4;
        
    }
   

    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        Node head = convertArr2LL(arr);
        int k = 5;

        print(head);
        System.out.println("Linked list before deletion of kth element");
        System.out.println("Linked List after deletion of kth element");
        head = deleteKthNode(head, k);
        print(head);
        
       

    }
}
