// You are given two non-negative numbers 'num1' and 'num2' represented in the form of linked lists.
// The digits in the linked lists are stored in reverse order, i.e. 
//starting from least significant digit (LSD) to the most significant digit (MSD), and each of their nodes contains a single digit.
// Calculate the sum of the two numbers and return the head of the sum list.
// Example :
// Input:
// 'num1' : 1 -> 2 -> 3 -> NULL
// 'num2' : 4 -> 5 -> 6 -> NULL
// Output: 5 -> 7 -> 9 -> NULL

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


public class problem_10 {
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

    public static Node sumOf2LL(Node head1, Node head2){
        Node t1 = head1,t2= head2;
        Node dummyNode = new Node(-1);
        int carry = 0;
        Node current = dummyNode;
        while (t1 != null || t2 != null) {
            int sum = carry;
            if (t1 != null){
                sum = sum + t1.data;
               
            }
            if(t2 != null){
                sum = sum + t2.data;
               
            }
            Node newNode = new Node(sum % 10);
            carry = sum / 10;
            current.next = newNode;
            current = current.next;
            if(t1 != null){
                t1 = t1.next;
            }
            if(t2 != null){
                t2 = t2.next;
            }
        }
        if(carry != 0){
            Node newNode = new Node(carry);
            current.next = newNode;
        }

        return dummyNode.next;
    }
    public static void print(Node head){
        
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        Node head1 = convertArr2LL(arr);
        int[] arr1 = {3,8,7};
        print(head1);
        Node head2 = convertArr2LL(arr1);
        print(head2);
        Node sumHead = sumOf2LL(head1, head2);
        print(sumHead);
    }
}
