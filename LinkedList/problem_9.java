//insert the value at head of the linked list
class Node{
    int data;
    Node next;

    Node(int data1,Node next){
        this.data = data1;
        this.next = next;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class problem_9 {
    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1; i< arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static void print(Node head){
        
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            
        }
        System.out.println();
    }

    
    public static Node insertHeadNode(Node head,int node){
        return new Node(node,head);
    }


    public static Node insertLastNode(Node head,int node){
       if(head == null){
            return new Node(node);
       }
       Node temp = head;
       while (temp.next != null) {
            temp = temp.next;
       }
       Node newNode = new Node(node);
       temp.next = newNode;
       return head;
        
    }

    public static Node insertEleBeforeX(Node head,int ele,int val){
        if(head == null){
            return null;
        }
        if(head.data == ele){
            return new Node(ele,head);
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data == val){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
            
        }
        return head;
       
    }

    public static Node insertAtKthPosition(Node head,int ele, int k){
        if(head == null){
            if(k == 1){
                return new Node(ele,head);
            }
            return head;
        }
        if(k == 1){
            return new Node(ele,head);
        }
        
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if(count == k-1){
                Node newNode = new Node(ele);
                newNode.next = temp.next;
                temp.next = newNode;
                break;

            }
            temp = temp.next;
            
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,9};
        Node head = convertArr2LL(arr);
        print(head);
        System.out.println("Linked list before insertion of element");
        System.out.println("Linked List after insertion of  element");
        head = insertHeadNode(head,7);
        print(head);
        System.out.println("Linked List after insertion of  element at the end");
        head = insertLastNode(head, 2);
        print(head);
        System.out.println("Linked List after insertion of  element at the kth position");
        head = insertAtKthPosition(head, 1, 3);
        print(head);
        System.out.println("Linked List after insertion of  element at the before the value x position");
        head = insertEleBeforeX(head,10,2);
        print(head);


    }
    
}
