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


public class problem_1 {

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
    public static Node insertHead(Node head,int ele){
        return new Node(ele,head,head.next);
    }
    public static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        return head;
        
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;

        
    }

    public static Node deleteKthNode(Node head,int k){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if(count == k) break;
            temp = temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(prev == null && front == null){
            return null;
        }
        else if(prev == null){
            return head.next;
        }
        else if (front == null){
            return deleteTail(head);
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

        return head;


    }

    public static void delNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        if(front == null){
            prev.next =null;
            temp.back = null;
            return;
        
        }
        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

       

    }


  

    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next; 
        }
        System.out.println();
       
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,9,1};
        Node head = createDLL(arr);
        print(head);
        System.out.println("Doubly linked deleting  before the head");
        // System.out.println("Doubly Linkedlist after  after head");
        // head = insertHead(head, 8);
        System.out.println("Doubly Linkedlist after deleting head");
        head = deleteHead(head);
        print(head);
        System.out.println("Doubly Linkedlist after deleting tail");
        head = deleteTail(head);
        print(head);
        System.out.println("Doubly Linkedlist after deleting kth element");
        head = deleteKthNode(head, 2);
        print(head);
        System.out.println("Doubly Linkedlist after deleting the element");
        delNode(head.next);
        print(head);
        

    }
}
