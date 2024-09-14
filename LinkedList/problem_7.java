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


public class problem_7 {
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

    public static Node deleteKElementNode(Node head,int ele){
        if(head == null) return null;
        if(head.data == ele){
            head = head.next;
            return head;
        }
        //if data is not at the head
        Node prev = null;
        Node temp = head;
        
        while (temp != null) {
            if(temp.data == ele){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            
            
        }
        return head;
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
        int element = 5;

        print(head);
        System.out.println("Linked list before deletion of element");
        System.out.println("Linked List after deletion of  element");
        head = deleteKElementNode(head, element);
        print(head);
        
       

    }
}

