// Remove Nth Node from the end of the LinkedList | Multiple Approaches


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

public class problem_13 {
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

    public static Node deleteNthNode(Node head,int k){
        Node fast = head;
        for (int i = 0; i < k; i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        Node slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;

        }
        slow.next = slow.next.next;
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
        int[] arr = {1,2,3,4,5,6};
        Node head = convertArr2LL(arr);
        print(head);
        head = deleteNthNode(head, 6);
        print(head);
       
      
    }
}
