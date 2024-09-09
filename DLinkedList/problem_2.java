//insertion head --> tail --> kth element --< before the node

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


public class problem_2 {
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

    public static Node insertAtHead(Node head,int ele){
        if(head == null){
            return null;
        }
        Node newHead = new Node(ele,head,null);
        head.back = newHead;
        return newHead;
    }

    public static Node insertAtTail(Node head,int ele){
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newTail = new Node(ele);
        newTail.back = prev;
        newTail.next = temp;
        prev.next = newTail;


      
        return head;
       
    }

    public static Node insertAtKthPos(Node head,int k,int ele){
        if(head == null){
            return null;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        Node newNode = new Node(ele,temp,prev);
        prev.next = newNode;
        temp.back = newNode;
        return head;
    }

    public static void insertBeforeNode(Node node,int val){
        Node prev = node.back;
        Node newNode = new Node(val,node,prev);
        prev.next = newNode;
        node.back = newNode;
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
        System.out.println("Doubly linked list before insertion of head");
        print(head);
        System.out.println("Doubly linked list after insertion of head");
        head = insertAtHead(head, 1);
        print(head);
        System.out.println("Doubly linked list after before of tail");
        head = insertAtTail(head, 8);
        print(head);
        System.out.println("Doubly linked list before insertion of  kth position");
        head = insertAtKthPos(head, 2, 9);
        System.out.println("Doubly linked list after insertion of  kth position");
        print(head);
        System.out.println("Doubly linked list before insertion of  before node");
        insertBeforeNode(head.next.next.next, 8);
        System.out.println("Doubly linked list after insertion of  before node");
        print(head);

    }
}
