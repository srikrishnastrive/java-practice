/**
 * Input: head -> 1 -> 2 -> 3 -> 4 -> 5
Output: head -> 1 -> 3 -> 5 -> 2 -> 4
Explanation: The nodes with odd indices are 1, 3, 5 and the ones with even indices are 2, 4.
 */

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


public class problem_11 {
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
    public static Node printOddEvenLL(Node head){
        Node odd = head,  even = head.next, evenNode = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;

        }
        odd.next = evenNode;
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
        int[] arr = {2,4,6,9,1,7,3};
        Node head = convertArr2LL(arr);
        print(head);
        head = printOddEvenLL(head);
        print(head);
    }
}
