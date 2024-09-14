//sort the linked list with 0's and 1's.


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


public class problem_12 {
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
   
    public static Node sortLinkedList(Node head){
        Node zeroHead = new Node(-0);
        Node onesHead = new Node(-0);
        Node twosHead = new Node(-0);
        
        Node zero = zeroHead;
        Node one = onesHead;
        Node two = twosHead;

        Node temp = head;

        while (temp != null) {
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else if (temp.data == 2){
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
       zero.next = (onesHead.next != null) ? onesHead.next : twosHead.next;
       one.next = twosHead.next;
       two.next = null;
       Node newHead = zeroHead.next;
       return newHead;
    }

    public static void print(Node head){
        
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,2};
        Node head = convertArr2LL(arr);
        print(head);
        head = sortLinkedList(head);
        print(head);
      
    }
}
