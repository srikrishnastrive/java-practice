
// Reverse a LinkedList | Iterative and Recursive
//Check if a LinkedList is Palindrome or Not | Multiple Approaches
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

public class problem_14 {
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

    public static Node reverseLL(Node head){
        Node temp = head, prev =null;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;

        }
        return prev;
    }

    public static Node reverseLLRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseLLRecursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static boolean checkPalindrome(Node head){
        if(head == null || head.next == null) return true;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverseLLRecursive(slow.next);
        Node first = head;
        Node second = newHead;
        while (second != null) {
            if(first.data != second.data){
                reverseLLRecursive(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseLLRecursive(newHead);
        return true;
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
        int[] arr1 = {1,2,3,3,2,1};
        Node head1 = convertArr2LL(arr1);
        print(head1);
        Node head = convertArr2LL(arr);
        print(head);
        head = reverseLL(head);
        print(head);
        head = reverseLLRecursive(head);
        print(head);
        boolean ans  = checkPalindrome(head1);
        System.out.println(ans);
        
       
       
      
    }
}

